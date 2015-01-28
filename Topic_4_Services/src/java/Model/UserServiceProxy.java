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
    public void removeUser(WebUser u, String password, String confirmPassword) {
        implement.removeUser(u, password, confirmPassword);
    }

    @Override
    public void modifiUser(WebUser u,String username, String password, String confirmPassword, String email, String fullname) {
        implement.modifiUser(u,username,password,confirmPassword,email,fullname);
    }

    @Override
    public WebUser getUser() {
        return implement.getUser();
    }

    @Override
    public void addFriend(Friend u) {
        implement.addFriend(u);
    }

    @Override
    public void removeFriend(Friend u) {
        implement.removeFriend(u);
    }

    @Override
    public void addLikeToPhoto(Photo p) {
        implement.addLikeToPhoto(p);
    }

}
