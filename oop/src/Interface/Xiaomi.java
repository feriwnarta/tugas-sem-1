/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Feri Winarta
 */
public class Xiaomi implements Phone{
    int baterai = 50;
    int volume = 25;
    boolean hidup;
    
    @Override
    public void powerButton() {
        hidup = true;
        if(hidup) {
            System.out.println("handphon menyala, logo xiaomi");
            System.out.println("Baterai sisa " + baterai);
        } else {
            System.out.println("Handphone tidak nyala, baterai sisa " + baterai);
        }
    }
    
    @Override
    public void powerButton(boolean b) {
        if(b == false) {
            System.out.println("handphone akan mati, goodbyte");
        }
    }

    @Override
    public void volumeButtonUp() {
        volume += 5;
        System.out.println("volume : " + volume);
    }

    @Override
    public void volumeButtonDown() {
        volume -= 5;
        System.out.println("volume : " + volume);
    }
    
    
    public static void main(String[] args) {
        
        
        
        
    }
}
