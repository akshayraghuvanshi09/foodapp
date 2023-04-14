package com.foodapp.iteam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.foodapp.iteam.dto.ItemRequestDto;
import com.foodapp.iteam.dto.ItemResponseDto;
import com.foodapp.iteam.exceptions.ItemException;
import com.foodapp.iteam.model.Item;
import com.foodapp.iteam.repository.IteamRepository;
import com.foodapp.iteam.service.ItemService;

@SpringBootTest
public class ItemServiceTest {

	@Autowired
	private ItemService itemService;

	@MockBean
	private IteamRepository iteamRepository;

	private ModelMapper mapper = new ModelMapper();

//	private Item item;

	@Test
	public void test_ViewAllItem() throws ItemException {
		List<Item> dtos = new ArrayList<>();
		dtos.add(new Item(1, "name", 10, 120.0, "category"));
		dtos.add(new Item(2, "name1", 19, 125.0, "categoryC"));

		// List<ItemResponseDto> list =
		// dtos.stream().map(e->mapper.map(e,ItemResponseDto.class)).collect(Collectors.toList());
		when(iteamRepository.findAll()).thenReturn(dtos);
		assertEquals(2, dtos.size());

	}

	@Test
	public void test_SaveCustomer() throws ItemException {
		System.out.println(itemService);
		ItemRequestDto itemRequestDto = new ItemRequestDto("name", 10, 120.0, "category");
		Item item = mapper.map(itemRequestDto, Item.class);
		ItemResponseDto itemResponseDto = mapper.map(item, ItemResponseDto.class);
		when(iteamRepository.save(item)).thenReturn(item);
		// assertEquals(item,itemService.addItem(itemRequestDto));
		assertEquals(itemRequestDto.getIteamName(), itemResponseDto.getIteamName());
		assertEquals(itemRequestDto.getQuantity(), itemResponseDto.getQuantity());
		assertEquals(itemRequestDto.getCost(), itemResponseDto.getCost());
		assertEquals(itemRequestDto.getCategory(), itemResponseDto.getCategory());
	}

//	@Test
//	public void Test_RemoveItem() throws ItemException{
//		
//		Item item = new Item(1,"name", 10, 120.0, "category");
//		itemService.removeItem(item.getIteamId());
//		when(iteamRepository.findById(item.getIteamId())).thenReturn(Optional.of(item));
//		when(itemService.removeItem(item.getIteamId())).thenReturn(item);
//		//doNothing().when(iteamRepository).deleteById(item.getIteamId());
//		//verify(iteamRepository,times(2)).findById(item.getIteamId());
//		
//	}

//	@Test
//	public void test_UpdateItem() throws ItemException {
//		Integer id = 1;
//		ItemRequestDto itemRequestDto = new ItemRequestDto("name", 10, 120.0, "category");
//		ItemResponseDto itemResponseDto = new ItemResponseDto("name", 10, 120.0, "category");
//		Item item=new Item(1, "pepsi", 5, 150.2, "soft drink");
//		when(iteamRepository.findById(id)).thenReturn(Optional.of(item));
//		System.out.println("--------------------");
//		when(itemService.updateItem(itemRequestDto, id)).thenReturn(Optional.of(itemResponseDto));
//		System.out.println();
//		assertEquals(itemRequestDto.getIteamName(), itemResponseDto.getIteamName());
//		assertEquals(itemRequestDto.getCategory(), itemResponseDto.getCategory());
//		assertEquals(itemRequestDto.getCost(), itemResponseDto.getCost());
//		assertEquals(itemRequestDto.getQuantity(), itemResponseDto.getQuantity());
//
//	}

}
