package com.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.dao.StuDAO;
import com.domain.Stu;

import utils.JdbcUtils;


public class StuDAOImpl implements StuDAO {

	@Override
	public List findStu() {
		
		//查询工具
		JdbcUtils jdbcutils=JdbcUtils.getInstance();
		
		//查询参数
		String sql="SELECT * FROM STU";
		Object[] params= {};
		
		//查询结果
		List stus=new ArrayList();
		stus=jdbcutils.findByType(sql, Stu.class, params);
		
		//返回查询结果
		return stus;
	}
	

	
}
