package com.neuedu.pooltest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;

public class PoolTest {
	public static void main(String[] args) throws Exception {
		//����һ������Դ����
		DruidDataSource data = new DruidDataSource();
		//��druid���ӳ��в���Ҫ���ü��ص�������
		//��������Դ
		data.setUrl("jdbc:mysql://127.0.0.1:3306/test1");
		data.setUsername("root");
		data.setPassword("1234");
		//�������ӳ��г�ʼ��ʱ���������Ӹ���
		data.setInitialSize(20);
		//�������ӳ����������������Ӹ���
		data.setMaxActive(30);
		//�������ӳ�����С���Ӹ���
		data.setMinIdle(5);
		//����ȡ�����ӵ����ȴ�ʱ��
		data.setMaxWait(3000);
		//������Դ��ȡ������
		Connection conn = data.getConnection();
		PreparedStatement psta = conn.prepareStatement("select * from emp");
		ResultSet rs = psta.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("empno"));
			System.out.println(rs.getString("ename"));
		}
	}
}
