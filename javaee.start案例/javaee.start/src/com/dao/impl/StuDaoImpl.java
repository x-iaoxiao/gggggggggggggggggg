package com.dao.impl;

import java.util.List;

import com.dao.StuDao;
import com.domain.Stu;
import com.genericity.impl.BasicDaoImpl;
import com.utils.db.DaoSupport;

public class StuDaoImpl extends BasicDaoImpl<Stu> implements StuDao{
	
	
	public static void main(String[] args) {
		StuDaoImpl impl = new StuDaoImpl();
		
		for (int i = 0; i <10000 ; i++) {
			impl.findAll();
		}
	}

	@Override
	public List<Stu> findAll() {
		
		String sql = "select * from STU";
		Object[] params = null;
		DaoSupport support = DaoSupport.getInstance();
		
		return support.queryForList(sql, Stu.class, params);
	}
	
	@Override
	public void saveStu(Stu stu) {
		super.save(stu);
	}
	
	@Override
	public void removeStuById(int id) {
		super.removeById(new Long(id));
	}
	
}
