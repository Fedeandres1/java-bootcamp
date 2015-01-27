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
public class UserServiceProxy implements UserService {

    UserService implement;

    protected UserServiceProxy(UserService imp) {
        this.implement = imp;
    }

    @Override
    public void createUser(String username, String password, String confirmPassword, String email, String fullname) {
        implement.createUser(username, password, confirmPassword, email, fullname);
    }

    @Override
    public void removeUser(Account u, String password, String confirmPassword) {
        implement.removeUser(u, password, confirmPassword);
    }

    @Override
    public void modifiUser() {
        implement.modifiUser();
    }

    @Override
    public Account getUser() {
        return implement.getUser();
    }

    @Override
    public void addFriend() {
        implement.addFriend();
    }

    @Override
    public void removeFriend() {
        implement.removeFriend();
    }

    @Override
    public void addLikeToPhoto() {
        implement.addLikeToPhoto();
    }

}
