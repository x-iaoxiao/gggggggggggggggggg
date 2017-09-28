package com.test;

import com.dao.StuDao;
import com.dao.TeacherDao;
import com.dao.impl.StuDaoImpl;
import com.dao.impl.TeacherDaoImpl;
import com.model.Stu;
import com.model.Teacher;

public class TestCase1 {

	public static void main(String[] args) {
		TeacherDao dao = new TeacherDaoImpl();
		StuDao dao2 = new StuDaoImpl();
		
		Teacher t = new Teacher( 9L , "JJaaa" , "456" , 1000.0);
		
//		dao.saveTeacher(t);
		
		
		
		Stu stu = new Stu(3 , "cat2" , 77.5 , 2);
//		
//		dao2.saveStu(stu);
		
		
		dao.removeTeacherById(9L);
	}
	
}
