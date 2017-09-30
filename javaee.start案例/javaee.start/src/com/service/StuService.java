package com.service;

import java.util.List;

import com.dao.StuDao;
import com.dao.impl.StuDaoImpl;
import com.domain.Stu;

public class StuService {
	
	private StuDao dao = new StuDaoImpl();
	
	public void saveStu(Stu stu) {
		dao.saveStu(stu);
	}
	
	public List getStus() {
		return dao.findAll();
	}
	
	public void removeStuById(int id) {
		dao.removeStuById(id);
	}

}
