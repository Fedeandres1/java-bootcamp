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
public class Customer {
    Account account;
    Address address;
    String email;
    Telephone telephone;
    String id;

    public Customer(Account account, Address address, String email, Telephone telephone, String id) {
        this.account = account;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
        this.id = id;
    }

    public Customer() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
}
