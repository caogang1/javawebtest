package com.xc.test;

import com.xc.dao.UserInfoDao;

public class demo {
	public static void main(String[] args) {
		UserInfoDao dao=new UserInfoDao();
		dao.deleteUserInfo("0003");
		String sql="'0006'+','+'132546'+','+'sjdlkf'";
		dao.InsertUserInfoDao(sql);
	}
	
}
