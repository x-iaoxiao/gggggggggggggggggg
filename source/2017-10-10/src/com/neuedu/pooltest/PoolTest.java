package com.neuedu.pooltest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;

public class PoolTest {
	public static void main(String[] args) throws Exception {
		//创建一个数据源对象
		DruidDataSource data = new DruidDataSource();
		//在druid连接池中不需要设置加载的驱动类
		//设置数据源
		data.setUrl("jdbc:mysql://127.0.0.1:3306/test1");
		data.setUsername("root");
		data.setPassword("1234");
		//设置连接池中初始化时创建的连接个数
		data.setInitialSize(20);
		//设置连接池中最大允许存在连接个数
		data.setMaxActive(30);
		//设置连接池中最小连接个数
		data.setMinIdle(5);
		//设置取得连接的最大等待时间
		data.setMaxWait(3000);
		//从数据源中取出连接
		Connection conn = data.getConnection();
		PreparedStatement psta = conn.prepareStatement("select * from emp");
		ResultSet rs = psta.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("empno"));
			System.out.println(rs.getString("ename"));
		}
	}
}
