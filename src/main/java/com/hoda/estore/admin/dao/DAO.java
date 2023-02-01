package com.hoda.estore.admin.dao;

import java.util.List;

public interface DAO<T> {

	//get all records
	List<T> getAll();

	//get one record
	T getOne(long id);

	// create a record
	int save(T obj);

	// update a record
	int update (T obj);

	// delete a record
	int delete(long id);


}
