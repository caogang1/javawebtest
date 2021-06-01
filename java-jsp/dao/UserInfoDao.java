package com.xc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserInfoDao {
	public void deleteUserInfo(String ac){
		try {
			//1.加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//2.设置连接信息
			String url="jdbc:mysql://127.0.0.1:3306/cg";
			String user="root";
			String password="root";
		
			//3.获取并打印连接
			Connection con=DriverManager.getConnection(url,user,password);
			Statement stm=con.createStatement();
			String sql="delete  from userInfo where account='"+ac+"'";   //这里是sql查询语句
			stm.executeUpdate(sql);

			}catch(ClassNotFoundException e1){
				e1.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	}
	
	public void InsertUserInfoDao(String a) {
		try {
			String sql="insert into userInfo values('"+a+"')";
			st().executeUpdate(sql);
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	public Statement st() {
		try{
			//1.加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//2.设置连接信息
			String url="jdbc:mysql://127.0.0.1:3306/cg";
			String user="root";
			String password="root";
		
			//3.获取并打印连接
			Connection con=DriverManager.getConnection(url,user,password);
			Statement stm=con.createStatement();
			return stm;
		}catch(ClassNotFoundException e1){
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}
}
