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
public class MeetingServiceWeb implements MeetingService{
MeetingService imp=new MeetingServiceImp();
    
    
    
    @Override
    public void createMeeting() {
     imp.createMeeting();
    }

    @Override
    public void updateMeeting() {
       imp.updateMeeting();
    }

    @Override
    public void removeMeeting() {
     imp.removeMeeting();
    }

    @Override
    public void consultMeeting() {
      imp.consultMeeting();
    }
    
    
    
    
    
}
