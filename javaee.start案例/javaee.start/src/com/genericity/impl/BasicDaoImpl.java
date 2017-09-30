package com.genericity.impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import com.annotation.Column;
import com.annotation.ID;
import com.genericity.BasicDao;
import com.utils.db.DaoSupport;

public class BasicDaoImpl<T> implements BasicDao<T> {

	private DaoSupport support =DaoSupport.getInstance();
	public Class<T> clazz;

	public BasicDaoImpl() {
		//接收 泛型 参数
		clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void save(T t) {
		
		String sql = "";

		String tableName = t.getClass().getSimpleName().toUpperCase();
		
		StringBuffer sbf = new StringBuffer();
		sbf.append(" insert into ").append(" ").append(tableName).append(" ").append(" ( ");

		Field[] fields = clazz.getDeclaredFields(); 
		Object[] params = new Object[fields.length]; // 问号 匹配的参数 数组
		
		for (int i = 0 ; i<fields.length; i++   ) {
			Column c = fields[i].getDeclaredAnnotation(Column.class);
			sbf.append( c.name() ).append(" , ");     
			try {
				fields[i].setAccessible(true);
				params[i] = fields[i].get(t);     
			} catch (Exception e) {
				System.out.println("有错啦~~");
				e.printStackTrace();
			}
		}
		sbf.deleteCharAt(sbf.lastIndexOf(","));
		sbf.append(" ) "); 
		
		sbf.append(" values ").append(" ( ");

		for (int i = 0; i < fields.length; i++) {
			sbf.append(" ? , ");
		}
		sbf.deleteCharAt(sbf.lastIndexOf(","));
		sbf.append(" ) ");
		sql = sbf.toString();
		////////////////////////////////////////////////////////////////////////

		support.executeUpdate( sql, params );
	}

	@Override
	public void removeById(Long id) {
		
		Field[] fields = clazz.getDeclaredFields();
		String condition = "";
		for (Field field : fields) {
			if(field.isAnnotationPresent(ID.class)) {
				condition = field.getName().toUpperCase();
			}
		}
		
		StringBuffer sbf = new StringBuffer("delete from ").append(" ").append(clazz.getSimpleName().toUpperCase());
		sbf.append(" where ").append(condition).append(" = ? ");
		
		support.executeUpdate( sbf.toString() , id );
	
	}

	@Override
	public void modify(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<T> findAll() {
		return null;
	}

	@Override
	public T getById(Long id) {
		return null;
	}

}
