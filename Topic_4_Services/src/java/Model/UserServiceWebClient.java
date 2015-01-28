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
public class UserServiceWebClient implements UserService{
UserService webService;
public UserServiceWebClient(){
    
    //webService= 
    
}
    @Override
    public void createUser(String username, String password, String confirmPassword, String email, String fullname) {
        webService.createUser(username, password, confirmPassword, email, fullname);
    }

    @Override
    public void removeUser(WebUser u, String password, String confirmPassword) {
        webService.removeUser(u, password, confirmPassword);
    }

    @Override
    public void modifiUser(WebUser u,String username, String password, String confirmPassword, String email, String fullname) {
       webService.modifiUser(u,username,password,confirmPassword,email,fullname);
    }

    @Override
    public WebUser getUser() {
    return   webService.getUser();
    }

    @Override
    public void addFriend(Friend u) {
       webService.addFriend(u);
    }

    @Override
    public void removeFriend(Friend u) {
    webService.removeFriend(u);
    }

    @Override
    public void addLikeToPhoto(Photo p) {
    webService.addLikeToPhoto(p);
    
    }
    
}
