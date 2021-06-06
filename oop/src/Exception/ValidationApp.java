/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.io.IOException;

public class ValidationApp {
    
    static void validate(LoginRequest login) throws ValidationException {
        if(LoginRequest.username() == null) {
            throw new ValidationException("username is null");
        } else if (LoginRequest.username().isBlank()) {
            throw new ValidationException("username is blank");
        } else if (LoginRequest.password() == null) {
            throw new ValidationException("password is null");
        } else if (LoginRequest.password().isBlank()) {
            throw new ValidationException("password is blank");
        } 
    }
    
    static void validasiRuntime(LoginRequest login) {
        if(LoginRequest.username() == null) {
            throw new NullPointerException("username is null");
        } else if (LoginRequest.username().isBlank()) {
            throw new BlankRuntimeException("username is blank");
        } else if (LoginRequest.password() == null) {
            throw new NullPointerException("password is null");
        } else if (LoginRequest.password().isBlank()) {
            throw new BlankRuntimeException("password is blank");
        } 
    }
    
    public static void main(String[] args) {
        
        LoginRequest login = new LoginRequest(null,null);
        
        try {
        validate(login);
        } catch(ValidationException val) {
            System.out.println("Data tidak valid " + val.getMessage());
        }
        
        
        LoginRequest login2 = new LoginRequest(null,null);
        validasiRuntime(login2);
        
        
        
    }
}
