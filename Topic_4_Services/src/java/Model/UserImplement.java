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
public class UserImplement implements UserService {

    WebUser user=null;

    protected UserImplement() {
        
    }

    @Override
    public void createUser(String username, String password, String confirmPassword, String email, String fullname) {
        user = new WebUser(username, password, confirmPassword, email, fullname);

    }

    /**
     * this method mark or eliminate the user in the database directly
     *
     * @param u
     * @param password
     * @param confirmPassword
     */
    @Override
    public void removeUser(WebUser u, String password, String confirmPassword) {
        u.state = UserState.Banned;
    }

    @Override
    public void modifiUser(WebUser user, String username, String password, String confirmPassword, String email, String fullname) {
        user.setFullname(fullname);
        user.setEmail(email);
        user.setLogin_id(username);
        user.setPassword(password);
        user.setConfirmPassword(confirmPassword);
    }

    @Override
    public WebUser getUser() {

        return user;
    }

    @Override
    public void addFriend(Friend u) {
        user.getFriend().add(u);
    }

    @Override
    public void removeFriend(Friend u) {
        user.getFriend().remove(u);
    }

    @Override
    public void addLikeToPhoto(Photo p) {
        p.incrementLikes();
    }

}
