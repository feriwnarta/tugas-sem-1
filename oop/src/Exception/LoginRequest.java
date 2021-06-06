/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Feri Winarta
 */
public class LoginRequest {
    private static String username;
    private static String password;
    
    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public static String username() {
        return LoginRequest.username;
    }
    
    public static String password() {
        return LoginRequest.password;
    }
    
}
