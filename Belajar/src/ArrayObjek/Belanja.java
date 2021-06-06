/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayObjek;

import java.util.Scanner;

/**
 *
 * @author Feri Winarta
 */
public class Belanja {
    protected String[]belanja = new String[3];
    Scanner input = new Scanner(System.in);
    
    void isiBelanja() {
        for(int i = 0; i < belanja.length; i++) {
            System.out.println("belanja " + (i+1) + ": ");
            belanja[i] = input.next();
        }
    }
}
