package com.dao;

import java.util.List;

import com.domain.Stu;

public interface StuDao {
	
	public void saveStu(Stu stu);
	public List<Stu> findAll();
	public void removeStuById(int id);

}
