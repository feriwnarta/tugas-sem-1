/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

/**
 *
 * @author Feri Winarta
 */
public class PrintFormat {
    public static void main(String[] args) {
//        Struktur Format
//        [argumen],[flags],[width],[.precision]
        System.out.println("Argumen index");
        
//        Halo santi, santi umur berapa ?, santi menjawab umur sya 17
        String nama = "santi";
        int umur = 17;
        System.out.printf("Halo %1$s, %1$s umur berapa ?, %1$s menjawab umur saya, %2$d\n",nama,umur);
        
        System.out.println("Flags");
        int a = 5;
        int b = 8;
        int hasil = a + b;
//        5 + 8 = 13
        System.out.printf("%d + %d = %d\n",a,b,hasil);
        hasil = a - b;
//        5 - 8 = -3
        System.out.printf("%d - %d = %d\n",a,b,hasil);
//        menampilkan tanda + nya
//        5 + 8 = +3 !! 
        hasil = a + b;
        System.out.printf("%d + %d = %+d\n",a,b,hasil);
        
//        width
        float f = 3000000f;
        System.out.printf("%,.0f",f);
        
    }
}
