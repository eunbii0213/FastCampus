package chapter2_practice04;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
		userLee.userId="a12345";
		userLee.userPassWord="asdf12345";
		userLee.userName="Lee";
		userLee.phoneNumber="01011111111";
		userLee.userAddress="Seoul, Korea";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("b12345","qwer12345","Kim");
		System.out.println(userKim.showUserInfo());
	}

}
