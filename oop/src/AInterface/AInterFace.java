/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AInterface;


public class AInterFace implements Car{
    public void run() {
        System.out.println("car is running");
    }
    
    public void rem() {
        System.out.println("the cars is stopped");
    }
    
    public void hasBrand() {
        System.out.println("the brands");
    }

    
    public void anj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
