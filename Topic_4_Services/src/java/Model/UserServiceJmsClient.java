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
public class UserServiceJmsClient implements UserService{
UserService jmsObject;
public UserServiceJmsClient(){
    //jmsObject=;
}
    @Override
    public void createUser(String username, String password, String confirmPassword, String email, String fullname) {
       jmsObject.createUser(username, password, confirmPassword, email, fullname);
    }

    @Override
    public void removeUser(WebUser u, String password, String confirmPassword) {
       jmsObject.removeUser(u,password,confirmPassword);
    }

    @Override
    public void modifiUser(WebUser u,String username, String password, String confirmPassword, String email, String fullname) {
        jmsObject.modifiUser(u,username,password,confirmPassword,email,fullname);
    }

    @Override
    public WebUser getUser() {
       return jmsObject.getUser();
    }

    @Override
    public void addFriend(Friend u) {
        jmsObject.addFriend(u);
    }

    @Override
    public void removeFriend(Friend u) {
      jmsObject.removeFriend(u);
    }
    @Override
     public void addLikeToPhoto(Photo p){
     jmsObject.addLikeToPhoto(p);
         };
    
}
