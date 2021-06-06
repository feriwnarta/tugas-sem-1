/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.uas;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
public class KuisUas {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("\n----------------------------------");
        System.out.println("======APLIKASI BIAYA TRAVELING====");
        System.out.println("----------------------------------");
        String nama;
        System.out.println("Masukan Nama anda = ");
        nama = input.nextLine();
        System.out.print("\n");
        
//        data penyimpanan
        int data2;
        String a;
        int[] peserta = null;
        String[] namaPeserta = null;
        String[] negaraTujuan = null;
        String[] member = null;
        int[] hari = null;
        boolean setengahPutaran = true;
        
        while(setengahPutaran) {
            int pass = menu(nama);
            switch(pass) {
                case 1 :
                    try {
                    System.out.println("Masukan Jumlah Peserta = ");
                    data2 = input.nextInt();
                    peserta = new int[data2];
                    namaPeserta = new String[data2];
                    negaraTujuan = new String[data2];
                    member = new String[data2];
                    hari = new int[data2];
                        for(int i = 0; i < data2; i++) {
                            System.out.println("Nama Peserta ke " + (i+1) + " : ");
                            namaPeserta[i] = input.next();
                            peserta[i] = (i+1); 
                            System.out.println("Pilihan Negara Tujuan [1-3] : ");
                            negaraTujuan[i] = input.next();
                            ulang(negaraTujuan,member,i,true,false);
                            System.out.println("Pilih Tipe Member [Silver / Gold] : ");
                            member[i] = input.next();
                            ulang(negaraTujuan,member,i,false,true);
                            System.out.println("Lama Hari [1 - 15]");
                            hari[i] = input.nextByte();
                            }
                    } catch(Exception er) {
                        System.err.println("\nERROR Anda memasukan String\nsilahkan masukan Angka");
                           
                    } 
                    break;
                case 2 :
                    display(peserta,namaPeserta,negaraTujuan,member,hari);
                    break;
                case 3 :
                    sort(peserta,namaPeserta,negaraTujuan,member,hari);
                    break;
                case 4 :
                   cetakFile(peserta,namaPeserta,negaraTujuan,member,hari);
                    break;
                case 5 :
                    System.out.println("Anda akan keluar");
                    return;  
            }
                System.out.println("apakah anda ingin menampilkan menu lagi (Y / N) = ");
                a = input.next();
                if(a.equalsIgnoreCase("y") || a.equalsIgnoreCase("n"))
                setengahPutaran = a.equalsIgnoreCase("y");
                System.out.print("\n");    
        }   
    }
 
    private static int menu(String nama) {
        Scanner input = new Scanner(System.in);
        int data = 0;
        System.out.println("===================================");
        System.out.println("Selamat datang, " + nama);
        System.out.println("Program perhitungan Biaya Traveling");
        System.out.println("===================================");
        System.out.println("Menu Utama \t:");
        System.out.println("--------------");
        System.out.println("1. Input data");
        System.out.println("--------------");
        System.out.println("2. Tampil data");
        System.out.println("--------------");
        System.out.println("3. Sort data");
        System.out.println("--------------");
        System.out.println("4. Cetak data");
        System.out.println("--------------");
        System.out.println("5. Exit"); 
        System.out.println("===================================");
        System.out.println("Masukan pilihan Menu [1 - 5] : ");
        boolean a = false;
        try{
        data = input.nextInt();    
        while(!a) {            
                if(data <= 5) {
                  break;
                }
                else {
                    System.err.println("nomor menu lebih, silahkan masukan dibawah 5 = ");  
                    data = input.nextInt();
                }
            }
        } catch(Exception e) {
            System.err.println("\nERRROR Input yang anda masukan berupa kata\nsilahkan"
                    + " masukan lagi berupa angka");
        }
        return data;
    }
    
    private static void display(int[]peserta,String[]namaPeserta,String[]negaraTujuan,String[]member,int[]hari) {
        System.out.println("\n\t\tDaftar pembayaran Peserta");
        System.out.println("=================================================================================================");
        System.out.println("No  |  Nama\t\t|  Tujuan\t\t|  Member\t  |  Lama(Hari)\t|  Biaya\t|");
        System.out.println("=================================================================================================");
        try {
            for(int i = 0; i < negaraTujuan.length; i++) {
                if(negaraTujuan[i].equalsIgnoreCase("1")) {
                    negaraTujuan[i] = "Korea";
                } else if(negaraTujuan[i].equalsIgnoreCase("2")) {
                    negaraTujuan[i] = "China";
                } else {
                    negaraTujuan[i] = "Japan";
                }
            }
        } catch(java.lang.NullPointerException e) {
            System.err.println("Data belum diinput");
        }   
        try {
            float dataPass[];
            dataPass = biaya(member,hari);
            for(int i = 0; i < peserta.length; i++) {
                System.out.printf(" %d\t%s\t\t    %s\t\t   %5s\t\t%d\t   %,.3f",peserta[i],namaPeserta[i],negaraTujuan[i],member[i],hari[i],dataPass[i]);
                System.out.print("\n");
            } 
        } catch(java.lang.NullPointerException e) {
            System.err.println("Data belum diinput ");
        }
        float dataTotal = total(member,hari);
        System.out.println("=================================================================================================");
        System.out.printf("\t\t\t\t\t\t\t\t\t    Total  : %,.3f\n",dataTotal);
    }
    
    private static float total(String[]member,int[]hari) {
        float data[];
        data = biaya(member,hari);
        float total = 0;
        for(int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }
    
    private static float[] biaya(String[]member,int[]hari) {
        float[] data = new float[member.length];
            for(int i = 0; i < member.length; i++) {
                if(member[i].equalsIgnoreCase("silver")) {
                    data[i] = hari[i] * 300f;
                } else {
                    data[i] = hari[i] * 250f;
                } 
            }
        return data;
    }
    
    private static void ulang(String[]negaraTujuan,String member[],int i,boolean a,boolean b) {
        Scanner input = new Scanner(System.in);
        boolean gasama = true;
        if(a) {
            while(gasama) {
                if(!negaraTujuan[i].equalsIgnoreCase("1") && !negaraTujuan[i].equalsIgnoreCase("2") && !negaraTujuan[i].equalsIgnoreCase("3") ){
                    System.err.println("Pilihan salah silahkan pilih [1 - 3]");
                    negaraTujuan[i] = input.next();
                } else {
                    break;
                }
            }
        }
        
        if(b) {
            while(gasama) {
               if(!member[i].equalsIgnoreCase("silver") && !member[i].equalsIgnoreCase("gold")) {
                   System.err.println("Pilihan salah silahkan pilih [Silver / gold]");
                   member[i] = input.next();
                   if(member[i].equalsIgnoreCase("silver") || member[i].equalsIgnoreCase("gold")) {
                   break;
                   }
               } else {
                 gasama = false;        
               }           
           }
        }
        
    }
    
    private static void sort(int[]peserta,String[]namaPeserta,String[]negaraTujuan,String[]member,int[]hari) {
       
        System.out.println("\n\t\tDaftar pembayaran Peserta");
        System.out.println("=================================================================================================");
        System.out.println("No  |  Nama\t\t|  Tujuan\t\t|  Member\t  |  Lama(Hari)\t|  Biaya\t|");
        System.out.println("=================================================================================================");
        
        try {
        char[] ambilChar  = new char[negaraTujuan.length]; 
        for(int i = 0; i < negaraTujuan.length; i++) {
            ambilChar[i] = negaraTujuan[i].charAt(0);
        }
//        
        String tempNegara,tempNama,tempMember;
        int tempHari;
        float tempBiaya;
        float[] pass = biaya(member,hari);
        char temp;
        for(int i = 1; i < negaraTujuan.length; i++){
            for(int j = negaraTujuan.length - 1; j >= i; j--){
//                //Proses Bandingkan
                if(ambilChar[j] < ambilChar[j-1]){
                    temp = ambilChar[j];
                    ambilChar[j] = ambilChar[j-1];
                    ambilChar[j-1] = temp;
////                    negaraTemp
                    tempNegara = negaraTujuan[j];
                    negaraTujuan[j] = negaraTujuan[j-1];
                    negaraTujuan[j-1] = tempNegara;
////                    tempNama
                    tempNama = namaPeserta[j];
                    namaPeserta[j] = namaPeserta[j-1];
                    namaPeserta[j-1] = tempNama;
//                    
////                    temp Member
                    tempMember = member[j];
                    member[j] = member[j-1];
                    member[j-1] = tempMember;
////                    tempHari
                    tempHari = hari[i];
                    hari[j] = hari[j-1];
                    hari[j-1] = tempHari;
////                    tempBiaya
                    tempBiaya = pass[i];
                    pass[j] = pass[j-1];
                    pass[j-1] = tempBiaya;
                }
            }
         }
            for(int i = 0; i < peserta.length; i++) {
                   System.out.printf(" %d\t%s\t\t    %s\t\t   %5s\t\t%d\t   %,.3f",peserta[i],namaPeserta[i],negaraTujuan[i],member[i],hari[i],pass[i]);
                   System.out.print("\n");
            } 
        } catch(java.lang.NullPointerException e) {
            System.err.println("Data belum diinput");
        }
        
        
    } 
    
    private static void cetakFile(int[]peserta,String[]namaPeserta,String[]negaraTujuan,String[]member,int[]hari)throws IOException {
//        buat file laporan txt
       FileWriter writeFile = new FileWriter("Laporan.txt");
       BufferedWriter buffWrite = new BufferedWriter(writeFile);
       
        buffWrite.write("\n\t\tDaftar pembayaran Peserta\n");
        buffWrite.write("=================================================================================================\n");
        buffWrite.write("No  |  Nama\t\t|  Tujuan\t\t|  Member\t  |  Lama(Hari)\t|  Biaya\t|\n");
            buffWrite.write("=================================================================================================\n");
        
        try {
        char[] ambilChar  = new char[negaraTujuan.length]; 
        for(int i = 0; i < negaraTujuan.length; i++) {
            ambilChar[i] = negaraTujuan[i].charAt(0);
        }
//        
        String tempNegara,tempNama,tempMember;
        int tempHari;
        float tempBiaya;
        float[] pass = biaya(member,hari);
        char temp = 0;
        for(int i = 1; i < negaraTujuan.length; i++){
            for(int j = negaraTujuan.length - 1; j >= i; j--){
//                //Proses Bandingkan
                if(ambilChar[j] < ambilChar[j-1]){
                    temp = ambilChar[j];
                    ambilChar[j] = ambilChar[j-1];
                    ambilChar[j-1] = temp;
////                    negaraTemp
                    tempNegara = negaraTujuan[j];
                    negaraTujuan[j] = negaraTujuan[j-1];
                    negaraTujuan[j-1] = tempNegara;
////                    tempNama
                    tempNama = namaPeserta[j];
                    namaPeserta[j] = namaPeserta[j-1];
                    namaPeserta[j-1] = tempNama;
//                    
////                    temp Member
                    tempMember = member[j];
                    member[j] = member[j-1];
                    member[j-1] = tempMember;
////                    tempHari
                    tempHari = hari[i];
                    hari[j] = hari[j-1];
                    hari[j-1] = tempHari;
////                    tempBiaya
                    tempBiaya = pass[i];
                    pass[j] = pass[j-1];
                    pass[j-1] = tempBiaya;
                }
            }
         }
            for(int i = 0; i < peserta.length; i++) {
                   String format = String.format(" %d\t%s\t\t    %s\t\t   %5s\t\t%d\t   %,.3f",peserta[i],namaPeserta[i],negaraTujuan[i],member[i],hari[i],pass[i]);
                   buffWrite.write(format);
                   buffWrite.newLine();
            } 
        } catch(java.lang.NullPointerException e) {
            System.err.println("Data belum diinput");
        }
        buffWrite.write("=================================================================================================");
        float dataTotal = total(member,hari);
        String format = String.format("\t\t\t\t\t\t\t\t\t    Total  : %,.3f\n",dataTotal);
        buffWrite.write(format);
        buffWrite.flush();
        buffWrite.close();
        System.out.println("Data berhasil di cetak");
    }
    
}


