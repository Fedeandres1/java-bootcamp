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

    public boolean createUser(String username,
            String password,
            String confirmPassword,
            String email,
            String fullname);

    public boolean removeUser(Account u,
            String password,
            String confirmPassword);

    public boolean modifiUser();

    public Account getUser();

    public boolean addFriend();

    public boolean removeFriend();

}
