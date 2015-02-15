package com.bootcamp.webapp.model;

public interface UserService {

	public void createUser(WebUser user);

	public void loginUser(String id_user, String pass);

}
