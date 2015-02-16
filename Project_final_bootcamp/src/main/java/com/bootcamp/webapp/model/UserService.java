package com.bootcamp.webapp.model;

public interface UserService {

	public void createUser(WebUser user, Phone p);

	public boolean loginUser(String id_user, String pass);

}
