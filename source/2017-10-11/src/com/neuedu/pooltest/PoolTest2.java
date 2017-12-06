package com.neuedu.pooltest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class PoolTest2 {
	public static void main(String[] args) throws Exception {
		//先创建一个properties对象
		Properties config = new Properties();
		config.load(PoolTest2.class.getClassLoader().getResourceAsStream("jdbc.properties"));
		//通过工厂生产连接池对象
		DataSource data = DruidDataSourceFactory.createDataSource(config);
		Connection conn = data.getConnection();
		PreparedStatement psta = conn.prepareStatement("select * from emp");
		ResultSet rs = psta.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("empno"));
		}
	}
}
