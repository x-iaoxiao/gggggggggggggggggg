package com.neuedu.pooltest;

import java.sql.Connection;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;

public class PoolTest1 {
	public static void main(String[] args) throws SQLException {
		DruidDataSource data = new DruidDataSource();
		//假设已经设置好连接参数
		data.setInitialSize(20);
		Connection conn = data.getConnection();
		//连接池中的close方法不是关闭连接,而是将连接放回池中
		conn.close();
	}
}
