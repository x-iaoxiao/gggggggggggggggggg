package com.service;

import java.util.List;

import com.dao.StuDAO;
import com.daoimpl.StuDAOImpl;

public class Initservice {

	private StuDAO studao=new StuDAOImpl();
	
	public List showStu() {
		
		return studao.findStu();
	}
	
	
}
