package com.xc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {

	public static void main(String[] args) {
		
		try {
			//1.加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.设置连接信息
			String url="jdbc:mysql://127.0.0.1:3306/cg";
			String user="root";
			String password="root";
			
			//3.获取并打印连接
			Connection con=DriverManager.getConnection(url,user,password);
//			System.out.println(con);
			Statement stm=con.createStatement();
			String sql="select * from userInfo";   //这里是sql查询语句
			
//			System.out.println(stm.getClass().getSimpleName());
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("username")+"  密码:"+rs.getInt("password"));
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
