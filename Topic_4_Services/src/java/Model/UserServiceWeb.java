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
public class UserServiceWeb implements UserService{
UserService imp=new UserImplement();
    @Override
    public void createUser(String username, String password, String confirmPassword, String email, String fullname) {
        imp.createUser(username, password, confirmPassword, email, fullname);
    }

    @Override
    public void removeUser(Account u, String password, String confirmPassword) {
        imp.removeUser(u,password,confirmPassword);
    }

    @Override
    public void modifiUser() {
        imp.modifiUser();
    }

    @Override
    public Account getUser() {
       return imp.getUser();
    }

    @Override
    public void addFriend() {
      imp.addFriend();
    }

    @Override
    public void removeFriend() {
     imp.removeFriend();
    }

    @Override
    public void addLikeToPhoto() {
     imp.addLikeToPhoto();
    }
    
    
    
    
    
}
