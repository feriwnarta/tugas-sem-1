/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TataUsaha;
import java.io.IOException;
import java.util.Scanner;


public class Application {
    private Scanner cInput = new Scanner(System.in);
    private int inputUser;
    private Spp spp;
    private Legitimasi l;
    private AmbilBuku a;
    
    public Application() {
        Legitimasi ls = new Legitimasi();
        Spp sp = new Spp();
        AmbilBuku a = new AmbilBuku();
        this.spp = sp;
        this.l = ls;
        this.a = a;
    }
    
    void menu() throws IOException {
        boolean c = false;
        while(!c) {
                System.out.println("*******TATA USAHA SMK BEGENGGONG**********");
                System.out.println("Tanggal : ");
                System.out.println("1. Bayar SPP");
                System.out.println("2. Cetak Daftar Ulangan");
                System.out.println("3. Ambil Buku");
                System.out.println("4. Daftar Masuk");
                System.out.println("Inputan : ");
                inputUser = cInput.nextInt();

                switch(inputUser) {
                    case 1 : 
                        spp.display();
                        break;
                    case 2 :
                        l.cetak();
                        break;
                    case 3 :
                        a.ambil();
                        break;
                    case 4 : 
                        System.out.println("Daftar Gelombang belum ditemukan");
                        break;
                    default :
                        System.out.println("Input salah");
                        break;
                }
                System.out.println("apakah anda ingin mengulang ? 1 / 2");
                int pick = cInput.nextInt();
                if(pick == 1) {
                    c = false;
                } else{
                     c = true;
                }
            }
    }
    
}
