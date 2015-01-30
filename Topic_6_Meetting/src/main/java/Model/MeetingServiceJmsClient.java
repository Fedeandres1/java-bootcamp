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
public class MeetingServiceJmsClient implements MeetingService{
    MeetingService jmsObject;

    public MeetingServiceJmsClient() {
        //jmsObject;
    }

    @Override
    public void createMeeting() {
       jmsObject.createMeeting();
    }

    @Override
    public void updateMeeting() {
       jmsObject.updateMeeting();
    }

    @Override
    public void removeMeeting() {
       jmsObject.removeMeeting();
    }

    @Override
    public void consultMeeting() {
       jmsObject.consultMeeting();
    }
    
}
