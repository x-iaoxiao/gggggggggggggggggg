package com.neuedu.service;

import com.neuedu.entity.User;

public interface UserService {

	/**
	 * �����û�����ѯ�û�
	 * @param username
	 * @return
	 */
	public User selectUserByUsername(String username);
	
}
