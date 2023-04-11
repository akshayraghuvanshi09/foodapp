package com.foodapp.iteam.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ItemResponseDto {

	private String iteamName;
	private Integer quantity;
	private Double cost;
	private String Category;
}