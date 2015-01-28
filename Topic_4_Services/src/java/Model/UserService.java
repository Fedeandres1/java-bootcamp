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
public interface UserService {

    /**
     *Create a new User
     * @param username id_user
     * @param password 
     * @param confirmPassword
     * @param email
     * @param fullname
     */ 
    public void createUser(String username,
            String password,
            String confirmPassword,
            String email,
            String fullname);

    public void removeUser(WebUser u,
            String password,
            String confirmPassword);

    public void modifiUser(WebUser u,String username, String password, String confirmPassword, String email, String fullname);

    public WebUser getUser();

    public void addFriend(Friend u);

    public void removeFriend(Friend u);
    public void addLikeToPhoto(Photo p);

}
