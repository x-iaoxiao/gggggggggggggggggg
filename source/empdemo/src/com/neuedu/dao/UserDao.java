package com.neuedu.dao;

import com.neuedu.entity.User;

public interface UserDao {

	/**
	 * �����û�����ѯ�û�
	 * @param username
	 * @return
	 */
	public User selectUserByUsername(String username);
	
}
