package CRUD;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.println("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    cariData();
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    tambahData();   
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    // ubah data
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    // hapus data
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-5]");
            }

            isLanjutkan = getYesorNo("Apakah Anda ingin melanjutkan");
        }
    }
    
    private static void tambahData() throws IOException{
        FileWriter write = new FileWriter("database.txt",true);
        BufferedWriter buff = new BufferedWriter(write);
        
        Scanner cInput = new Scanner(System.in);
        
        String penulis,judul,penerbit,tahun;
        
        System.out.println("Masukan penulis : ");
        penulis = cInput.nextLine();
        System.out.println("Masukan judul : ");
        judul = cInput.nextLine();
        System.out.println("Masukan Penerbit : ");
        penerbit = cInput.nextLine();
        System.out.println("Masukan tahun [YYYY] : ");
        tahun = ambilTahun();
        
        buff.close();
    }
    
    private static String ambilTahun() {
        Scanner input = new Scanner(System.in);
        String tahun = input.nextLine();
        
        boolean thnValid = true;
        while(thnValid) {
            try {
                Year.parse(tahun);
                thnValid = !thnValid;
            } catch(Exception e) {
                System.err.println("Format tahun salah ,[YYYY]");
                System.out.println("Masukan tahun lagi [YYYY] : ");
                tahun = input.nextLine();
            }
        }
        return tahun;
    }
    
    private static void cariData() throws IOException {
        Scanner cInput = new Scanner(System.in);
//        baca Database
        try {
            File file = new File("db.txt");
        } catch(Exception e) {
            System.err.println("File tidak ditemukan");
        }
        
//        ambil keyword User
        System.out.println("Masukan kata kunci : ");
        String cari = cInput.nextLine();
        String[] keywords = cari.split("\\s");
       
//        cek keywods
        cekBuku(keywords);
    }
    
    private static void cekBuku(String[] keywords)throws IOException {
        FileReader read = new FileReader("db.txt");
        BufferedReader buff = new BufferedReader(read);
        boolean isExist;
        String data = buff.readLine();
        int nomorData = 0;

        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        while(data != null) {           
            isExist = true;
//        mencocokan kata kunci dengan database
            for(String key : keywords) {
                isExist = isExist && data.toLowerCase().contains(key.toLowerCase());
            }
            
//        Jika exist true    
            if(isExist) {
                nomorData++;
                StringTokenizer stringToken = new StringTokenizer(data, ",");

                stringToken.nextToken();
                System.out.printf("| %2d ", nomorData);
                System.out.printf("|\t%4s  ", stringToken.nextToken());
                System.out.printf("|\t%-20s   ", stringToken.nextToken());
                System.out.printf("|\t%-20s   ", stringToken.nextToken());
                System.out.printf("|\t%s   ", stringToken.nextToken());
                System.out.print("\n");        
            }
            data = buff.readLine();
        }
        
//    jika data tidak ada
        if(nomorData == 0) {
            System.err.println("data tidak ditemukan, pastikan data ada"
                    + " dan kata pencarian benar");
            System.err.println("kata pencarian anda " + Arrays.toString(keywords));
        }
    }

    private static void tampilkanData() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("db.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahoeloe");
            return;
        }


        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        String data = bufferInput.readLine();
        int nomorData = 0;
        
        while(data != null) {
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            stringToken.nextToken();
            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%4s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%s   ", stringToken.nextToken());
            System.out.print("\n");

            data = bufferInput.readLine();
        }

        System.out.println("----------------------------------------------------------------------------------------------------------");
    }

    private static boolean getYesorNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("\n"+message+" (y/n)? ");
        String pilihanUser = terminalInput.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+" (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");

    }

    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }
}
