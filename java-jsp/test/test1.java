package com.xc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {

	public static void main(String[] args) {
		
		try {
			//1.����������
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.����������Ϣ
			String url="jdbc:mysql://127.0.0.1:3306/cg";
			String user="root";
			String password="root";
			
			//3.��ȡ����ӡ����
			Connection con=DriverManager.getConnection(url,user,password);
//			System.out.println(con);
			Statement stm=con.createStatement();
			String sql="select * from userInfo";   //������sql��ѯ���
			
//			System.out.println(stm.getClass().getSimpleName());
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("username")+"  ����:"+rs.getInt("password"));
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
