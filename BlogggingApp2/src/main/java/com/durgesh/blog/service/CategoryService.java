package com.durgesh.blog.service;

import java.util.List;

import com.durgesh.blog.payloads.CategoryDto;

public interface CategoryService {
	
	//create
	public CategoryDto createcategory(CategoryDto categoryDto);
	
	//update
	public CategoryDto updatecategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete
	void deletecategory(Integer categoryId);
	
	//get
	public CategoryDto getcategory(Integer categoryId);
	
	//get All
	List<CategoryDto> getCategories();

}
