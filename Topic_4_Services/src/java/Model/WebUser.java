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
public class WebUser {

    private String login_id, password, email, fullname, confirmPassword;
    protected UserState state;
    private Customer customer;
    private ShoppingCart cart;
    private ArrayList<Friend> friend;

    public ArrayList<Friend> getFriend() {
        return friend;
    }

    public void setFriend(ArrayList<Friend> friend) {
        this.friend = friend;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
    public WebUser(){
        friend=new ArrayList();
        
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public ShoppingCart getCart(){
        if(cart==null){
            cart=new ShoppingCart();
        }
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public WebUser(String login_id, String password, String confirm, String email, String fullname) {
        this.login_id = login_id;
        this.password = password;
        this.email = email;
        this.fullname = fullname;
        this.confirmPassword = confirm;
        state = UserState.New;
        friend = new ArrayList();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

}
