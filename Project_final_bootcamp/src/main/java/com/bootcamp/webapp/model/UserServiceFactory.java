package com.bootcamp.webapp.model;

public class UserServiceFactory {
	private UserServiceFactory() {
	}

	public static UserService getLocalService() {
		return new UserImplement();
	}

	public static UserService getRemoteServiceUsingJms() {
		return new UserServiceProxy(new UserServiceJmsClient());
	}

	public static UserService getRemoteServiceUsingWebService() {
		return new UserServiceProxy(new UserServiceWebClient());
	}
}
