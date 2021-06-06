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
public class CobaUlang {
    public static void main(String[] args) {
        int[] bilangan = {1,56,23,76,43};
        
        System.out.print("data sebelum sorting : ");
        for(int data : bilangan) {
            System.out.print(data + " ");
        }
        System.out.println("");
        
        System.out.println("proses sorting bubble dengan tipe descending");
        for(int i = 0; i < bilangan.length; i++) {
            for(int j = 0; j < bilangan.length - 1; j++) {
                if(bilangan[j] < bilangan[j + 1]) {
                    int temp = bilangan[j];
                    bilangan[j] = bilangan[j+1];
                    bilangan[j+1] = temp;
                }
            }
        }
        
        System.out.print("data sesudah sorting [descending] : ");
        for(int data : bilangan) {
            System.out.print(data + " ");
        }
        
        System.out.println("proses sorting bubble dengan tipe Ascending");
        for(int i = 0; i < bilangan.length; i++) {
            for(int j = 0; j < bilangan.length - 1; j++) {
                if(bilangan[j] > bilangan[j + 1]) {
                    int temp = bilangan[j+1];
                    bilangan[j+1] = bilangan[j];
                    bilangan[j] = temp;
                }
            }
        }
        
        System.out.print("data sesudah sorting [ascending] : ");
        for(int data : bilangan) {
            System.out.print(data + " ");
        }
        
        
    }
}
