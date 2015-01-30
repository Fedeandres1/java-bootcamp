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
public class MeetingServiceFactory {
    private MeetingServiceFactory(){};
    
    public static MeetingService getLocalService(){  
        return new MeetingServiceImp ();  
    }  
  
    public static MeetingService getRemoteServiceUsingJms(){  
        return new MeetingServiceProxy (new MeetingServiceJmsClient());  
    }  
  
    public static MeetingService getRemoteServiceUsingWebService(){  
        return new MeetingServiceProxy (new MeetingServiceWebClient());  
    } 
    
    
    
    
    
    
    
}
