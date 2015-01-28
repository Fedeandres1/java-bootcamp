/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Frederic
 */
public class UserImplementTest {

    public UserImplementTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of createUser method, of class UserImplement.
     */
    @Test
    public void testCreateUser() {
        System.out.println("Test createUser");
        String username = "Federico";
        String password = "123456";
        String confirmPassword = "123456";
        String email = "FS_secre@hotmail.com";
        String fullname = "Federico Solterman";
        UserImplement instance = new UserImplement();
        instance.createUser(username, password, confirmPassword, email, fullname);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of removeUser method, of class UserImplement.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("Test removeUser");
        WebUser u = new WebUser();
        u.setFullname("Federico Solterman");
        String password = "123456";
        String confirmPassword = "123456";
        UserImplement instance = new UserImplement();
        instance.removeUser(u, password, confirmPassword);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of modifiUser method, of class UserImplement.
     */
    @Test
    public void testModifiUser() {
        System.out.println("Test modifiUser");
        WebUser user = new WebUser();
        user.setFullname("Federico Solterman");
        String username = "Sonda";
        String password = "123456";
        String confirmPassword = "123456";
        String email = "dsad";
        String fullname = "123456";
        UserImplement instance = new UserImplement();
        instance.modifiUser(user, username, password, confirmPassword, email, fullname);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getUser method, of class UserImplement.
     */
    @Test
    public void testGetUser() {
        System.out.println("Test getUser");
        UserImplement instance = new UserImplement();
        WebUser expResult = null;
        WebUser result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of addFriend method, of class UserImplement.
     */
    @Test
    public void testAddFriend() {
        System.out.println("Test addFriend");
        Friend u = new Friend();
        UserImplement instance = new UserImplement();
        String username = "Federico";
        String password = "123456";
        String confirmPassword = "123456";
        String email = "FS_secre@hotmail.com";
        String fullname = "Federico Solterman";
        instance.createUser(username, password, confirmPassword, email, fullname);
        instance.addFriend(u);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of removeFriend method, of class UserImplement.
     */
    @Test
    public void testRemoveFriend() {
        System.out.println("Test removeFriend");
        Friend u = new Friend();
        UserImplement instance = new UserImplement();
        String username = "Federico";
        String password = "123456";
        String confirmPassword = "123456";
        String email = "FS_secre@hotmail.com";
        String fullname = "Federico Solterman";
        instance.createUser(username, password, confirmPassword, email, fullname);

        instance.addFriend(u);
        instance.removeFriend(u);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of addLikeToPhoto method, of class UserImplement.
     */
    @Test
    public void testAddLikeToPhoto() {
        System.out.println("Test addLikeToPhoto");
        Photo p = new Photo();
        UserImplement instance = new UserImplement();
        instance.addLikeToPhoto(p);
        // TODO review the generated test code and remove the default call to fail.

    }

}
