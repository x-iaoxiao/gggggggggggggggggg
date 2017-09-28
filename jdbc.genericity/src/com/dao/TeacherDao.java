package com.dao;

import java.util.List;

import com.model.Teacher;

public interface TeacherDao {
	
	public void saveTeacher(Teacher teacher);
	public List<Teacher> findAll();
	public void removeTeacherById(Long id);

}
