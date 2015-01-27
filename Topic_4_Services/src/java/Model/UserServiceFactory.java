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
public class UserServiceFactory {
    private UserServiceFactory() {}  
  
    public static UserService getLocalService(){  
        return new UserImplement ();  
    }  
  
    public static UserService getRemoteServiceUsingJms(){  
        return new UserServiceProxy (new UserServiceJmsClient());  
    }  
  
    public static UserService getRemoteServiceUsingWebService(){  
        return new UserServiceProxy (new UserServiceWebClient());  
    }  
}
