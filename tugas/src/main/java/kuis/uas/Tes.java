/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.uas;

/**
 *
 * @author Feri Winarta
 */
import java.util.Arrays;
import java.util.Scanner;
public class Tes {
    public static void main(String[] args) {
//        String motor1 = "korea";
//        String motor2 = "japan";
//        System.out.println(motor1.compareTo(motor2)); // cjk
//        System.out.println(motor2.compareTo(motor1));
//        
//        System.out.println(motor1.charAt(0));


            for(int a = 1; a <= 5; a++) {
//                refference
                int b = 1; 
                System.out.println(b);
                b++;
            }
            
           Scanner input = new Scanner(System.in);
//           mendefinisikan suatu variabel untuk for loop harus di taruh diluar scope
           int[] data = new int[5];
           for(int i = 0; i < 5; i++) {             
               System.out.println("masukin data");
               data[i] = input.nextInt();
               System.out.println(Arrays.toString(data));
              
            }
           
           
          
            
            
            
    }
}
