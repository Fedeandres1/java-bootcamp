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
public class Meeting {

    private ArrayList<Room> room;
    private ArrayList<Attendee> attendee;
    private ArrayList<Schedule> schedule;

    public Meeting() {
    }

    public void addSchedule(Schedule s) {
        if (schedule == null) {
            schedule = new ArrayList();
        }
        schedule.add(s);

    }

    public void removeSchedule(Schedule s) {
        schedule.remove(s);

    }

    public void removeAttendee(Attendee a) {
        attendee.remove(a);
    }

    public void addAttendee(Attendee a) {
        if (attendee == null) {
            attendee = new ArrayList();
        }
        attendee.add(a);

    }

    public void addRoom(Room r) {
        if (room == null) {
            room = new ArrayList();
        }
        room.add(r);

    }

    public void removeRoom(Room r) {
        room.remove(r);
    }

    public Meeting(ArrayList<Room> room, ArrayList<Attendee> attendee, ArrayList<Schedule> schedule) {
        this.room = room;
        this.attendee = attendee;
        this.schedule = schedule;
    }

    public ArrayList<Room> getRoom() {
        return room;
    }

    public void setRoom(ArrayList<Room> room) {
        this.room = room;
    }

    public ArrayList<Attendee> getAttendee() {
        return attendee;
    }

    public void setAttendee(ArrayList<Attendee> attendee) {
        this.attendee = attendee;
    }

    public ArrayList<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<Schedule> schedule) {
        this.schedule = schedule;
    }

}
