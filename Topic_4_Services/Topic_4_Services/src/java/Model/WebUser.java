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
public class WebUser {
    
    String login_id,password,email,fullname;
    UserState stateUser;
    Customer customer;
    ShoppingCart cart;

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public WebUser(String login_id, String password, String email, String fullname, UserState stateUser, Customer customer, ShoppingCart cart) {
        this.login_id = login_id;
        this.password = password;
        this.email = email;
        this.fullname = fullname;
        this.stateUser = stateUser;
        this.customer = customer;
        this.cart = cart;
    }

   

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    

    public WebUser() {
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public UserState getStateUser() {
        return stateUser;
    }

    public void setStateUser(UserState stateUser) {
        this.stateUser = stateUser;
    }
    
}
