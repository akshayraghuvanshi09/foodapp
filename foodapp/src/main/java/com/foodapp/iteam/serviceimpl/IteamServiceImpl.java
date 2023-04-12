package com.foodapp.iteam.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.iteam.dto.ItemRequestDto;
import com.foodapp.iteam.dto.ItemResponseDto;
import com.foodapp.iteam.exceptions.ItemException;
import com.foodapp.iteam.model.Item;
import com.foodapp.iteam.repository.IteamRepository;
import com.foodapp.iteam.service.ItemService;

@Service
public class IteamServiceImpl implements ItemService {

	@Autowired
	private IteamRepository repository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public ItemResponseDto addItem(ItemRequestDto item) throws ItemException {

		System.out.println("before map");
		Item it = mapper.map(item, Item.class);
		System.out.println("after maap");
		Item save = repository.save(it);
		ItemResponseDto itemResponseDto = mapper.map(save, ItemResponseDto.class);
		return itemResponseDto;
	}

	@Override
	public Optional<ItemResponseDto> updateItem(ItemRequestDto item,Integer itemId) throws ItemException {
		
		Optional<Item> byId = repository.findById(itemId);
		if (byId.isPresent()) {
			Item it = mapper.map(byId.get(), Item.class);
			ItemResponseDto dto= mapper.map(it, ItemResponseDto.class);
			System.out.println(dto);
			return Optional.of(dto);
		} else {
			throw new ItemException("No such item found...");
		}

	}

	@Override
	public Item viewItem(Integer itemId) throws ItemException {
		Optional<Item> opt = repository.findById(itemId);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new ItemException("No item found with this id " + itemId);
		}
	}

	@Override
	public Item removeItem(Integer itemId) throws ItemException {

		Optional<Item> opt = repository.findById(itemId);
		if (opt.isPresent()) {
			Item item = opt.get();
			repository.deleteById(itemId);
			return item;
		} else {
			throw new ItemException("No item found with this id " + itemId);
		}

	}

	@Override
	public List<ItemResponseDto> viewAllItems() throws ItemException {
		List<Item> items = repository.findAll();
		if (items.size() > 0) {
			List<ItemResponseDto> list = items.stream().map(e->mapper.map(e, ItemResponseDto.class)).collect(Collectors.toList());
			
			return list;
		} else {
			throw new ItemException("No item exists.. ");
		}

	}

}
