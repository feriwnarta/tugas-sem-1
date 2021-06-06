/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectArray;

/**
 *
 * @author Feri Winarta
 */

class Data extends TipeData{
    Data(int angka) {
        super(angka);
    }
    
}


public class TipeData {    
    int angka;
    Data d;
    
    public TipeData(int angka) {
        this.angka = angka;
    }
    
    public static void main(String[] args) {
        
        Data d = new Data(10);
        
        TipeData[] tipe = new TipeData[5];
        tipe[0] = d;
        System.out.println(tipe[0]);
        
        
        
        
        
    }
}
