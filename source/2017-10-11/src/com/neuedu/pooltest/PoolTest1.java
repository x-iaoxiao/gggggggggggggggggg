package com.neuedu.pooltest;

import java.sql.Connection;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;

public class PoolTest1 {
	public static void main(String[] args) throws SQLException {
		DruidDataSource data = new DruidDataSource();
		//�����Ѿ����ú����Ӳ���
		data.setInitialSize(20);
		Connection conn = data.getConnection();
		//���ӳ��е�close�������ǹر�����,���ǽ����ӷŻس���
		conn.close();
	}
}
