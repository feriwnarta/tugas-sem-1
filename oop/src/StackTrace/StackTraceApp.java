/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackTrace;

/**
 *
 * @author Feri Winarta
 */
public class StackTraceApp {
    public static void main(String[] args) {
        try {
            String[] names = {
                "Feri",
                "Winarta",
                "begenggong"
            };
            System.out.println(names[100]);
        }catch(Throwable e) {
            StackTraceElement[] stack = e.getStackTrace();
            
            e.printStackTrace();
        }
        
        
        
    }
}
