package demo.mvc.service;

import demo.mvc.model.User;

public class User_Service {
	public User_Service() {
		
	}
	public boolean checkLogin(User user) {
		if("admin".equals(user.getUserName()) && "123456".equals(user.getPassWord())) {
			return true;
		}
		else
			return false;
	}
}
