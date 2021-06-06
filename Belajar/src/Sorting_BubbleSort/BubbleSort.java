/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting_BubbleSort;

/**
 *
 * @author Feri Winarta
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[]bilangan = {5,12,3,19,56};

        System.out.print("Data sebelum Sorting : ");
        for(int data : bilangan) {
            System.out.print(data + " ");
        }
        System.out.println("");
        
//    proses bubble short
        System.out.println("Bubble sort");
        for(int i = 0; i < bilangan.length; i++) {
            for(int j = 0; j < bilangan.length - 1; j++) {
                if(bilangan[j] < bilangan[j+1]) {
                    int temp = bilangan[j];
                    bilangan[j] = bilangan[j+1];
                    bilangan[j+1] = temp;
                }
            }
        }
        
//     hasil sesudah sorting
        System.out.print("Data sesudah Sorting : ");
        for(int data : bilangan) {
            System.out.print(data + " ");
        }
        
    }    
}
