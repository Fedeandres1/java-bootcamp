package com.bootcamp.webapp.model;

import com.bootcamp.webapp.model.persistanse.Operation;

public class UserImplement implements UserService {
	Operation operation = new Operation();

	protected UserImplement() {
	}

	@Override
	public void createUser(WebUser user, Phone p) {
		String query = "";

		operation.openConnection();
		operation.saveObject(p);
		user.setId_phone(p.getId_phone());
		query = " INSERT INTO WEBUSER( id_user , password , email , id_phone )  "
				+ " VALUES ( '"
				+ user.getId_user()
				+ " ' , ' "
				+ user.getPassword()
				+ " ' , ' "
				+ user.getEmail()
				+ " ' ,  "
				+ user.getId_phone() + ")  ";
		operation.executeQuery(query);
		operation.closeConnection();
	}

	@Override
	public void loginUser(String id_user, String pass) {

	}

}
