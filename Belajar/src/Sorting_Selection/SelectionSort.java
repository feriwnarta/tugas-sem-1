/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting_Selection;

import java.util.Arrays;

/**
 *
 * @author Feri Winarta
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] bilangan = {5,12,3,19,1,47};
        
        System.out.println(Arrays.toString(bilangan));
        
        System.out.println("Proses selection");
        
        for(int i = 0; i < bilangan.length; i++) {
            for(int j = 0; j < bilangan.length; j++) {
                boolean tukar = false;
                int index = 0;
                int min = bilangan[i];
                for(int k = i + 1; k < bilangan.length; k++ ) {
                    if(min > bilangan[k]) {
                        tukar = true;
                        index = k;
                        min = bilangan[k];
                    }
                }
                if(tukar == true) {
                    int temp = bilangan[i];
                    bilangan[i] = bilangan[index];
                    bilangan[index] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(bilangan));
        
    }
}
