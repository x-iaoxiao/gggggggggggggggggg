package com.neuedu.service;

import java.util.List;

import com.neuedu.entity.Emp;

public interface EmpService {
	
	/**
	 * ��ѯȫ��emp
	 * @return
	 */
	public List<Emp> selectEmpList();
	
}
