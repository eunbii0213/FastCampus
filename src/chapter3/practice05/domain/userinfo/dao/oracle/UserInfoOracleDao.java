package chapter3.practice05.domain.userinfo.dao.oracle;

import chapter3.practice05.domain.userinfo.UserInfo;
import chapter3.practice05.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into Oracle DB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("insert into Oracle DB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("insert into Oracle DB userId = " + userInfo.getUserId());
		
	}
	
	

}
