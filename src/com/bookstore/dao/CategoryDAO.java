package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.bookstore.entity.Category;

public class CategoryDAO extends JpaDAO<Category> implements GenericDAO<Category> {
	public CategoryDAO()
	{
		
	}
	
	public CategoryDAO(EntityManager entityManager)
	{
		super(entityManager);
	}
	
	public  Category create(Category category) {
		// TODO Auto-generated constructor stub
		
		return super.create(category);
	}

	
	@Override
	public Category update(Category category) {
		
		return super.update(category);
	}

	@Override
	public Category get(Object id) {
		// TODO Auto-generated method stub
		return super.find(Category.class, id);
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
		super.delete(Category.class, id);
	}

	@Override
	public List<Category> listAll() {
		return super.findWithNamedQuery("Category.findAll");
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		
		
		return countWithNamedQuery("Category.countAll");
	}
	
	public Category findByName(String categoryName)
	{
		
		List<Category> result = super.findWithNamedQuery("Category.findByName","name", categoryName);
		if (result != null && result.size() > 0) {
			return result.get(0);
		}
	return null;
	}

}
