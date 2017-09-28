package com.dao;

import java.util.List;

import com.model.Stu;

public interface StuDao {
	
	public void saveStu(Stu stu);
	public List<Stu> findAll();

}
