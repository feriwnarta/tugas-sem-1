/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_linear_search;

import java.util.Scanner;
class Linear {
     private int[] dataArray;
     private short value;
     Scanner input = new Scanner(System.in);
    
     Linear() {
         isiArray();
     }

     private void isiArray() {
         System.out.println("Masukan berapa banyak data nya = ");
         this.value = this.input.nextShort();
         dataArray = new int[value];
         System.out.println("===ISI ARRAY===");
         for(int i = 0 ; i < value; i++) {
            System.out.println("data ke " + (i + 1) + " = " );
            dataArray[i] = input.nextInt();
         }
     }
     
     void displayArray() {
         for(int data : dataArray) {
             System.out.print(data + "\n");
         }
     }
     
     void searchLinear() {
         System.out.println("Masukan angka yg dicari = ");
         short cari = this.input.nextShort();
         for(int i = 0; i < this.value; i++) {
             if(cari == dataArray[i]) {
                 System.out.println("Ketemu hasilnya " + dataArray[i]);
             }
             else {
                 System.out.println("Tidak ketemu -_-");
             }
         }
     }
     
     
    
}

public class Main {
    public static void main(String[] args) {
        Linear search = new Linear();
        search.displayArray();
        search.searchLinear();
    }
}
