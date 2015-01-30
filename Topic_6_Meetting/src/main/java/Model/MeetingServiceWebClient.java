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
public class MeetingServiceWebClient implements MeetingService{
MeetingService webService;



 public MeetingServiceWebClient() {
     
     //webService
     
    }


    @Override
    
    public void createMeeting() {
       webService.createMeeting();
    }

   

    @Override
    public void updateMeeting() {
       webService.updateMeeting();
    }

    @Override
    public void removeMeeting() {
      webService.removeMeeting();
    }

    @Override
    public void consultMeeting() {
       webService.consultMeeting();
    }
    
}
