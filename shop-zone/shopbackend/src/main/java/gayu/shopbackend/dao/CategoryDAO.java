package gayu.shopbackend.dao;

import java.util.List;

import gayu.shopbackend.dto.category;

public interface CategoryDAO {

	boolean add(category category);
	
	List<category> list();
	
	category get(int id);
	
	
	
;}
