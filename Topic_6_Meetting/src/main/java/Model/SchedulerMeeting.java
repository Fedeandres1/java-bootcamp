/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Frederic
 */
public class SchedulerMeeting {

    private ArrayList meeting;

    public SchedulerMeeting() {
        meeting = new ArrayList();
    }

    public SchedulerMeeting(ArrayList meeting) {
        this.meeting = meeting;
    }

    public ArrayList getMeeting() {
        return meeting;
    }

    public void setMeeting(ArrayList meeting) {
        this.meeting = meeting;
    }

    public void addSchedulerMeeting(Meeting m) {
        if (meeting == null) {
            meeting = new ArrayList();
        }
        meeting.add(m);

    }

    public void removeSchedulerMeeting(Meeting m) {
        meeting.remove(m);

    }

    @Override
    public String toString() {
        return "SchedulerMeeting{" + "meeting=" + meeting + '}';
    }

}
