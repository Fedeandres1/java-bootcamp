package com.bootcamp.webapp.model;

import javax.jws.WebService;

@WebService
public class UserServiceWeb implements UserService {
	UserService imp = new UserImplement();

	@Override
	public void createUser(WebUser user, Phone p) {
		imp.createUser(user, p);

	}

	@Override
	public void loginUser(String id_user, String pass) {
		imp.loginUser(id_user, pass);

	}

}
