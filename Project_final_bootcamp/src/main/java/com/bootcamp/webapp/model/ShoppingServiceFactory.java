package com.bootcamp.webapp.model;

public class ShoppingServiceFactory {
	private ShoppingServiceFactory() {
	}

	public static ShoppingCartService getLocalService() {
		return new ShoppingCartImplement();
	}

	public static ShoppingCartService getRemoteServiceUsingJms() {
		return new ShoppingServiceProxy(new ShoppingJmsClient());
	}

	public static ShoppingCartService getRemoteServiceUsingWebService() {
		return new ShoppingServiceProxy(new ShoppingWebServiceClient());
	}
}
