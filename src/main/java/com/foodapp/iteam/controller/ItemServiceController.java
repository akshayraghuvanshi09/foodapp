package com.foodapp.iteam.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.iteam.dto.ItemRequestDto;
import com.foodapp.iteam.dto.ItemResponseDto;
import com.foodapp.iteam.model.Item;
import com.foodapp.iteam.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemServiceController {

	@Autowired
	private ItemService itemService;
	
	@Autowired
	private ModelMapper mapper;
	
	@PostMapping("/add")
	public ResponseEntity<ItemResponseDto> addItem(@RequestBody ItemRequestDto item){
		
	
		ItemResponseDto newItem = itemService.addItem(item);
		return new ResponseEntity<ItemResponseDto>(newItem,HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{itemID}")
	public ResponseEntity<ItemResponseDto> updateItem(@RequestBody ItemRequestDto item,@PathVariable("itemID") Integer itemId){
		ItemResponseDto updateItem = itemService.updateItem(item,itemId);
		return new ResponseEntity<ItemResponseDto>(updateItem,HttpStatus.OK);
	}
	
	@GetMapping("/view/{itemId}")
	public ResponseEntity<Item> getItem(@PathVariable("itemId") Integer itemId){
		Item viewItem = itemService.viewItem(itemId);
		return new ResponseEntity<Item>(viewItem,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/remove/{itemId}")
	public ResponseEntity<Item> removeItem(@PathVariable("itemId") Integer itemId){
		
		Item removeItem = itemService.removeItem(itemId);
		return new ResponseEntity<Item>(removeItem,HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/viewall")
	public ResponseEntity<List<ItemResponseDto>> getAllItem(){
		List<ItemResponseDto> viewAllItems = itemService.viewAllItems();
		
		return new ResponseEntity<List<ItemResponseDto>>(viewAllItems,HttpStatus.OK);
	}
	
}
