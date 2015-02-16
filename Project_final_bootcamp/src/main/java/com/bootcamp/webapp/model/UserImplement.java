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
		query = " INSERT INTO WEBUSER( id_user , user_password , email , id_phone )  "
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
	public boolean loginUser(String id_user, String pass) {
		boolean res = false;
		String query = "";
		// this query has %id_user% dont right but the hibernate dont let me do
		// the query with out that
		query = " select w from WebUser w   where  w.id_user like '%" + id_user
				+ "%' and w.user_password like '%" + pass + "%' ";

		operation.openConnection();

		res = operation.searchUser(query);
		operation.closeConnection();

		return res;

	}

}
