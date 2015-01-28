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
    public void removeUser(WebUser u, String password, String confirmPassword) {
        imp.removeUser(u,password,confirmPassword);
    }

    @Override
    public void modifiUser(WebUser u,String username, String password, String confirmPassword, String email, String fullname) {
        imp.modifiUser(u,username,password,confirmPassword,email,fullname);
    }

    @Override
    public WebUser getUser() {
       return imp.getUser();
    }

    @Override
    public void addFriend(Friend u) {
      imp.addFriend(u);
    }

    @Override
    public void removeFriend(Friend u) {
     imp.removeFriend(u);
    }

    @Override
    public void addLikeToPhoto(Photo p) {
     imp.addLikeToPhoto(p);
    }
    
    
    
    
    
}
