/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Menu {
    private Scanner input = new Scanner(System.in);
    private byte inputUser;
    private int pin;
    Login login;
    private boolean isExist;
    private boolean isAda;
    private String strPin;
    String nama;
    
    void setLogin(Login login) {
        this.login = login;
    }
 
    void showMenu()throws IOException {
        System.out.println("========== M-Bank ==========");
        System.out.println("1.M-info\t2.Payment");
        System.out.println("3.Transfer\t4.Commerce");
        System.out.println("============================");
        System.out.println("pilihan : ");
        inputUser = input.nextByte();
        while(inputUser > 4 || inputUser < 1) {
            System.out.println("Kode salah silagkan masukan 1 - 4 :");
            inputUser = input.nextByte();
        }
        pilihan();
    }
    
    private void pilihan() throws IOException {
        switch(inputUser) {
            case 1 : 
                mInfo();
                break;
           case 2 :
                System.out.println("Payment");
                break;
           case 3 :
                System.out.println("transfer");
                break;
           case 4 :
                System.out.println("commerce");
                break;
        }
    }
    
    void mInfo() throws IOException {
        FileReader read = new FileReader("database.txt");
        BufferedReader buff = new BufferedReader(read); 
        
        System.out.println("Masukan pin atm :");
        pin = input.nextInt();
        Integer intpin = pin;
        strPin = intpin.toString();

//        cek pin
        String data = buff.readLine();
        while(data != null) {
            if(data.contains(nama) && data.contains(strPin)) {
                isAda = true;
                saldo();
            } 
            data = buff.readLine();
        }
//        
    }
    
    void saldo() throws IOException {
        FileReader read = new FileReader("database.txt");
        BufferedReader buff = new BufferedReader(read);
        Scanner scan = new Scanner(buff);
        
        while(scan.hasNext()) {
            if(scan.next().contains(strPin)) {
                System.out.println("Nama Nasabah : " + scan.next() + " " + scan.next());
                System.out.println("Sisa Saldo : " + scan.next());
            }
        }
        

     
    }
    
    void setNama() {
        this.nama = login.getName();
    }
    
   
    
    
}
