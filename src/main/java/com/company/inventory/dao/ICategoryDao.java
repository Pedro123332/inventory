package com.company.inventory.dao;

import org.springframework.data.repository.CrudRepository;
import com.company.inventory.model.Category;

//CrudRepository es una clase por defecto de spring
public interface ICategoryDao extends CrudRepository<Category, Long>{
	
	
	
}
