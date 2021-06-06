/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HexString;

import java.util.Arrays;

class Vp {
    
}

public class Main {
    public static void main(String[] args) {
        int[]dataInt = {1,2,3,4,5};
        
        Vp vp = new Vp();
        System.out.println(vp);
        System.out.println(vp.toString());
        
        
    }
    
    private static void cekAddres(int[] array) {
        int hash = Arrays.hashCode(array);
        System.out.println(Integer.toHexString(hash));
    }
}
