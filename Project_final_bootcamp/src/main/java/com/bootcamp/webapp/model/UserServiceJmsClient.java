package com.bootcamp.webapp.model;

public class UserServiceJmsClient implements UserService {
	UserService jmsObject;

	public UserServiceJmsClient() {
		// jmsObject=;
	}

	@Override
	public void createUser(WebUser user, Phone p) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean loginUser(String id_user, String pass) {
		return false;

	}

}
