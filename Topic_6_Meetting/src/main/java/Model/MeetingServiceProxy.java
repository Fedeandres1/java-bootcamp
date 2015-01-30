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
public class MeetingServiceProxy implements MeetingService{
    MeetingService implementation;  
  
    protected MeetingServiceProxy(MeetingService imp) {  
        this.implementation = imp;  
    }  

    @Override
    public void createMeeting() {
        implementation.createMeeting();
    }

    @Override
    public void updateMeeting() {
        implementation.updateMeeting();
    }

    @Override
    public void removeMeeting() {
        implementation.removeMeeting();
    }

    @Override
    public void consultMeeting() {
      implementation.consultMeeting();
    }
    
    
    
    
}
