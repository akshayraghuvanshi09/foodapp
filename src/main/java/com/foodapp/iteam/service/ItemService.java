package com.foodapp.iteam.service;

import java.util.List;
import java.util.Optional;

import com.foodapp.iteam.dto.ItemRequestDto;
import com.foodapp.iteam.dto.ItemResponseDto;
import com.foodapp.iteam.exceptions.ItemException;
import com.foodapp.iteam.model.Item;

public interface ItemService {

	public ItemResponseDto addItem(ItemRequestDto item)throws ItemException;
	
	public Optional<ItemResponseDto>  updateItem(ItemRequestDto item,Integer itemId)throws ItemException;
	
	public Item viewItem(Integer itemId)throws ItemException;
	
	public Item removeItem(Integer itemId)throws ItemException;
	
	public List<ItemResponseDto> viewAllItems()throws ItemException;
}
