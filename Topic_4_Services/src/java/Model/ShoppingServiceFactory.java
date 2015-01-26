/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Frederic
 */
public class ShoppingServiceFactory {
    private ShoppingServiceFactory() {}  
  
    public static ShoppingCartService getLocalService(){  
        return new ShoppingCartImplement ();  
    }  
  
    public static ShoppingCartService getRemoteServiceUsingJms(){  
        return new ShoppingServiceProxy (new ShoppingJmsClient());  
    }  
  
    public static ShoppingCartService getRemoteServiceUsingWebService(){  
        return new ShoppingServiceProxy (new ShoppingWebServiceClient());  
    }  
}
