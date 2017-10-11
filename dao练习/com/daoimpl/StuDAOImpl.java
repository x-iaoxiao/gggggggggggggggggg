package com.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.dao.StuDAO;
import com.domain.Stu;

import utils.JdbcUtils;


public class StuDAOImpl implements StuDAO {

	@Override
	public List findStu() {
		
		//��ѯ����
		JdbcUtils jdbcutils=JdbcUtils.getInstance();
		
		//��ѯ����
		String sql="SELECT * FROM STU";
		Object[] params= {};
		
		//��ѯ���
		List stus=new ArrayList();
		stus=jdbcutils.findByType(sql, Stu.class, params);
		
		//���ز�ѯ���
		return stus;
	}
	

	
}
