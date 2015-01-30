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
public class Attendee {

    private String first_name;
    private String last_name;
    private String email;
    private int id_employee;
    private int dni;
    private int telephone;
private int cel_phone;
    public Attendee() {
    }

    public Attendee(String first_name, String last_name, String email, int id_employee, int dni, int telephone, int cel_phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.id_employee = id_employee;
        this.dni = dni;
        this.telephone = telephone;
        this.cel_phone = cel_phone;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getCel_phone() {
        return cel_phone;
    }

    public void setCel_phone(int cel_phone) {
        this.cel_phone = cel_phone;
    }

}
