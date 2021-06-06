/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodPass;

/**
 *
 * @author Feri Winarta
 */
public class PassApp {
    public static void main(String[] args) {
        // pass by value
        int a = 5;
        addres(a);
        // perubahan variabel a terjadi hanya di method saja
        ubahA(a);
        System.out.println(a);
        
        System.out.println("\n\n Uji coba ke dua - b = 10");
        int b = 10;
        addres(b);
        ubahB(b);
        
        System.out.println("\n\n Uji coba ke dua - c = 4, d = 2;");
        int c = 4;
        int d = 2;
        addres(c);
        addres(d);
        ubahC(d,c);
        
        // kesimpulan bahwa saat method call, tipedata di dalam method
        // akan menggunakan 1 memori yang sama jika tidak ada perubahaan
        // saat ada perubahan nilai paramaternya, akan merubah addres yang
        // tadi sama juga.....
        
}
    static void addres(int b) {
        int adres = System.identityHashCode(b);
        System.out.println(Integer.toHexString(adres));
    }
    
    static void ubahA(int a) {
        a = a * a;
        System.out.println(a);
        addres(a);
        
    }
    
    static void ubahB(int b ) {
        b = b + b;
        System.out.println(b);
        addres(b);
    }
    
    static void ubahC(int b, int c) {
        System.out.println(b);
        addres(b);
//        int f = c;
//        f = f * f;
//        c = f;
        c = c * c;
        System.out.println(c);
        addres(c);
        
    }
}
