/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.uas;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
/**
 *
 * @author Feri Winarta
 */

class Traveling {
     private static String name;
     private static int peserta;
     private final static Scanner input = new Scanner(System.in);
    
    static String openMenu() {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("\n----------------------------------");
        System.out.println("======APLIKASI BIAYA TRAVELING====");
        System.out.println("----------------------------------");
        System.out.println("Masukan Nama Anda = ");
        name = input.nextLine();
        Traveling.name = name;
        return name;
    }
    
    static int menu() {
        int pilihan;
        Scanner input = new Scanner(System.in);
        System.out.println("\nSelamat Datang, " + Traveling.name);
        System.out.println("Program penghitungan Biaya Traveling");
        System.out.println("Menu Utama : ");
        System.out.println("1. Input Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Sort Data");
        System.out.println("4. Cetak Data");
        System.out.println("5. Exit");
        
        System.out.println("Masukan pilihan menu = ");
        pilihan = input.nextInt();
        return pilihan;
    }
    
    static void select()throws IOException {
        int pilihan = menu();
        int peserta1;
        Scanner input = new Scanner(System.in);
        switch(pilihan) {
            case 1 : 
                System.out.println("Masukan jumlah Peserta = ");
                peserta1 = input.nextInt();
                Traveling.peserta = peserta1;
                caseLoop();
            case 2 :
                System.out.println("case 2");
                break;
            case 3 :
                System.out.println("case 3");
                break;
            case 4 :
                System.out.println("case 5");
                break;
            default : 
                break;
        }
    }
    
    static void caseLoop()throws IOException {
        FileWriter writeFile = new FileWriter("database.txt");
        BufferedWriter buffWrite = new BufferedWriter(writeFile);
       try {
            int loop = Traveling.peserta;
            String inputStr;
            int inputInt;
            Scanner input = new Scanner(System.in);
            for(int i = 0; i < loop; i++) {
                System.out.println("Nama peserta ke " + (i+1));
                inputStr = input.next();
                buffWrite.write(inputStr + ",");
                System.out.println("Pilihan Negara Tujuan [1,2,3] ");
                inputInt = input.nextInt();
                reLoop(inputInt);
                buffWrite.write(inputInt + ",");
                System.out.println("pilih tipe member [Silver / Gold] ");
                inputStr = input.next();
                reLoop(inputStr);
                buffWrite.write(inputStr + ",");
                System.out.println("Lama hari [1 - 15] ");
                inputInt = input.nextInt();
                reLoopDay(inputInt);
                buffWrite.write(inputInt + ",");
                buffWrite.newLine();
                
            }
        } catch(Exception e) {
            System.err.println("Inputan anda salah, program akan terulang"); 
        }
        buffWrite.flush();
        select();
    }
    
    static int reLoop(int pilihan) {
        int inputt = 0;
        while(pilihan > 3) {
            System.out.println("Kode salah silahkan masukan [1-3] = ");
            inputt = Traveling.input.nextInt();
            if(inputt > 3) {
                System.out.println("Kode salah silahkan masukan [1-3] = ");
                inputt = Traveling.input.nextInt();
            } else if(inputt == 0) {
                System.out.println("Kode salah silahkan masukan [1-3] = ");
                inputt = Traveling.input.nextInt();
            } else {
                break;
            }
        }
         return inputt;
    }
    
    static String reLoop(String pilihan) {
        String inputt = null;
        while(!pilihan.equalsIgnoreCase("silver") && !pilihan.equalsIgnoreCase("gold")) {
            System.out.println("Kode salah silahkan masukan [silver / gold] = ");
            inputt = Traveling.input.next();
            if(inputt.equalsIgnoreCase("silver") || inputt.equalsIgnoreCase("gold")) {
                break;
            }
        }
         return inputt;
    }
    
    static int reLoopDay(int pilihan){
        int input = 0;
        while(pilihan > 15) {
            System.out.println("Jumlah hari melebihi peraturan hotel,\nSilahkan masukan [1 - 15] = ");
            input = Traveling.input.nextInt();
            if(input == 0 ) {
            System.out.println("Anda tidak jadi menginap ?, silahkan masukan jumlah hari diatas 0 = ");
            input = Traveling.input.nextInt();
            }
            else {
                break;
            }
        }
        return input;
    }
    
    static void displayData()throws IOException {
        FileReader readFile = new FileReader("database.txt");
        BufferedReader buffRead = new BufferedReader(readFile);
        String data = buffRead.readLine();
        StringTokenizer st = new StringTokenizer(data,",");
        
        System.out.println("\n\t\tDaftar pembayaran Peserta");
        System.out.println("=================================================================================================");
        System.out.println("No  |  Nama\t\t|  Tujuan\t\t|  Member\t  |  Lama(Hari)\t|  Biaya\t|");
        System.out.println("=================================================================================================");
        
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        
    }
   
    
    
}

public class Main {
    public static void main(String[] args)throws IOException {
       String name = Traveling.openMenu();
       Traveling obj1 = new Traveling(); 
//       int pilihan = Traveling.menu();
       try {
       Traveling.select();
       Traveling.displayData();
       } catch (Exception e) {
           System.err.println(e);
       }
      
       
       
       
       
       
        
        
    }
}
