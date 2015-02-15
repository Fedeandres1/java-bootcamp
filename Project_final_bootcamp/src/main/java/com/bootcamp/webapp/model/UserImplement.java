package com.bootcamp.webapp.model;

public class UserImplement implements UserService {
	Operation operation = null;

	protected UserImplement() {
	}

	@Override
	public void createUser(WebUser user) {
		operation.openConnection();
		operation.saveObject(user);
		operation.closeConnection();

	}

	@Override
	public void loginUser(String id_user, String pass) {

	}

}
