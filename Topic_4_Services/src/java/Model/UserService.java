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

    public void createUser(String username,
            String password,
            String confirmPassword,
            String email,
            String fullname);

    public void removeUser(Account u,
            String password,
            String confirmPassword);

    public void modifiUser();

    public Account getUser();

    public void addFriend();

    public void removeFriend();
    public void addLikeToPhoto();

}
