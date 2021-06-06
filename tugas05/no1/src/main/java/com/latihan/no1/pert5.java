/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Louissfigosalim;

/**
 *
 * @author Louiss Figo
 */
public class pert5 {
    public static void main(String[] args) {
        System.out.println("Bilangan Genap antara 1-20 = ");
        int i=1, genap=2,jumlah=0;

            while(i<=10){

                System.out.println(i+".  "+genap);
                jumlah += genap;
                genap = genap+2;
                i++;
            }
            System.out.println("------------");
            System.out.println("jumlah >=" + jumlah);
        
    }
}
