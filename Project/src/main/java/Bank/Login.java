package Bank;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    private Scanner input = new Scanner(System.in);
    private byte inputUser;
    private int kodeAkses;
    private final int db_akses = 123654;
    boolean isAkses;
    String name;
    
     void loginDisplay() {
        System.out.println("=======================================");
        System.out.println("\tSelamat Datang Di\n\tBca Mobile");
        System.out.println("=======================================");
        System.out.println("1. Buka Akun \t 2. Login");
        System.out.println("=======================================");
        System.out.println("Pilihan : ");
        this.inputUser = input.nextByte();
        
        while(inputUser > 2) {
            System.out.println("Kode salah, silahkan pilih ulang");
            System.out.println("Masukan pilihan ulang : ");
            this.inputUser = input.nextByte();
        }
         switch(inputUser) {
            case 1 :
                System.out.println("Register");
                break;
            case 2 :
                login();
                break;
            default :
                System.out.println("Kode salah");
                System.out.println("silahkan masukan ulang");
                break;    
          }
    }  
    
   
    private void login() {
        
        while(true) {
            System.out.println("Kode Akses (6 digit) ");
            kodeAkses = input.nextInt();
//            cek kode akses
            if(kodeAkses == db_akses) {
                isAkses = true;
                name = "Feri Winarta";
                break;
            } else {
                System.out.println("Kode salah, isi ulang");
            }
        }
    }
    
    protected boolean getAkses(){
        return isAkses;
    }
    
    String getName() {
        return this.name;
    }
    
}
