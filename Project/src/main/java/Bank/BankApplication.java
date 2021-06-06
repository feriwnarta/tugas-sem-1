/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Feri Winarta
 */
public class BankApplication {
    public static void main(String[] args) throws IOException {
//        instansiasi objek
        Login log = new Login();
        Menu banktut = new Menu();
        
//        Konek objek
        banktut.setLogin(log);
        banktut.login.loginDisplay();
        
        banktut.setNama();
        banktut.showMenu();
       
        
       
        
//        banktut.saldo();
        
        
        
     
    }
}
