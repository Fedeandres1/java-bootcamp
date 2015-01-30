/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Frederic
 */
public class Schedule {
    private Date day;
    private String hour_from;
    private String hour_to;

    public Schedule() {
    }

    public Schedule(Date day, String hour_from, String hour_to) {
        this.day = day;
        this.hour_from = hour_from;
        this.hour_to = hour_to;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getHour_from() {
        return hour_from;
    }

    public void setHour_from(String hour_from) {
        this.hour_from = hour_from;
    }

    public String getHour_to() {
        return hour_to;
    }

    public void setHour_to(String hour_to) {
        this.hour_to = hour_to;
    }

    @Override
    public String toString() {
        return "Schedule{" + "day=" + day + ", hour_from=" + hour_from + ", hour_to=" + hour_to + '}';
    }
    
}
