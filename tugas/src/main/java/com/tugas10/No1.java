/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas10;

/**
 *
 * @author Feri Winarta
 */
import java.util.*;
import java.io.*;
public class No1 {
    public static void main(String[] args) {
        int jmlh;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan jumlah Mahasiswa = ");
        jmlh = input.nextInt();
        int[] dataJml = new int[jmlh];
        int[] dataMhs = new int[jmlh];
        String[] namaMhs = new String[jmlh];
        double[] nilaiTgs = new double[jmlh];
        double[] nilaiUts = new double[jmlh];
        double[] nilaiUas = new double[jmlh];
//      
       
        for(int i = 0; i < jmlh; i++) {
            System.out.println("Mahasiswa ke = " + (i + 1) );
            dataMhs[i] = ( i + 1);
            System.out.println("Nama Siswa = ");
            namaMhs[i] = input.next();
            System.out.println("Nilai Tugas = ");
            nilaiTgs[i] = input.nextDouble();
            System.out.println("Nilai uts = ");
            nilaiUts[i] = input.nextDouble();
            System.out.println("Nilai Uas = ");
            nilaiUas[i] = input.nextDouble();
     
            }
        

        double nilaiAkhir[] = nilaiAkhir(nilaiTgs, nilaiUts, nilaiUas);
        String grade[] = ubahGrade(nilaiAkhir);
        output(dataMhs,namaMhs,nilaiTgs,nilaiUts,nilaiUas,nilaiAkhir,grade);
        
        System.out.println("===================================================================================");
        
//        Membuat file
        try {
            File fileBaru = new File("datainput.txt");
            if(fileBaru.createNewFile()) {
                System.out.println("File " + fileBaru.getName() + " Berhasil Di Buat");
            } else {
                System.out.println("File telah tersedia");
            }
            
        }  catch(IOException e ){
            System.err.println("File Gagal Dibuat");
        } 
        
       try {
       writeFile(dataMhs,namaMhs,nilaiTgs,nilaiUts,nilaiUas,nilaiAkhir,grade);
           System.out.println("File berhasil diinput ke datainput.txt");
       } catch(Exception e) {
           System.out.println("Data gagal diinput ke datainput.txt");
       }
        
       
       try {
           outWriten(dataMhs,namaMhs,nilaiTgs,nilaiUts,nilaiUas,nilaiAkhir,grade);
           System.out.println("Data berhasil dioutput ke daftarnilai.txt");
       } catch(Exception e) {
           System.out.println("Data gagal dioutput");
       }

        System.out.println("Silahkan Buka File datainput.txt dan output daftarnilai.txt ");
        
    }
    private static double[] nilaiAkhir(double[] tugas, double[] uts, double[] uas) {
        double[] gantiTgs = new double[tugas.length];
        double[] gantiUts = new double[uts.length];
        double[] gantiUas = new double[uas.length];
        double[] nilaiAkhir = new double[tugas.length];
        
        for(int i = 0; i < tugas.length; i++) {
            gantiTgs[i] = (tugas[i] * 30) / 100;
            gantiUts[i] = (uts[i] * 30) / 100;
            gantiUas[i] = (uas[i] * 40) / 100;        
        }
        
        for(int i = 0; i < tugas.length; i++) {
            nilaiAkhir[i] =+ (gantiTgs[i] + gantiUts[i] + gantiUas[i]);
        }
        return nilaiAkhir;
    }
    
    private static String[] ubahGrade(double[] nilaiAkhir) {
        String[] grade = new String[nilaiAkhir.length];
        for(int i = 0; i < nilaiAkhir.length; i++) {
            if(nilaiAkhir[i] >= 80) {
                grade[i] = "A";
            } else if(nilaiAkhir[i] >= 70 && nilaiAkhir[i] <= 79) {
                grade[i] = "B";
            } else if (nilaiAkhir[i] >= 59 && nilaiAkhir[i] <= 69) {
                grade[i] = "C";
            } else if(nilaiAkhir[i] >= 50 && nilaiAkhir[i] <= 58) {
                grade[i] = "D";
            } else {
                grade[i] = "E";
            }
        }
        return grade;
    }
    
    private static void output(int[] dataMhs, String[]namaMhs, double[]tugas, double[]uts
    ,double[]uas, double[]nilaiAkhir, String[]grade) {
            System.out.println("\t\t\t\tDAFTAR NILAI");
            System.out.println("\t\t\t\tDAFTAR NILAI");
            System.out.println("-----------------------------------------------"
                    + "------------------------------------");
            System.out.println("No \tNama Mahasiswa\t\t\tNilai\t\t\tGrade");
            System.out.println("\t\t\t----------------------------------------");
            System.out.println("\t\t\t" + " "   + "Tugas      " + "Uts        " + "Uas     " + "   Akhir" );
            System.out.println("");
            System.out.println("===================================================================================");

           for(int i = 0 ; i < tugas.length; i++) {
               System.out.print(dataMhs[i] + "\t");
               System.out.print(namaMhs[i] + "\t" + " ");
               System.out.print("\t" + " " );
               System.out.print(tugas[i]);
               System.out.print("\t" + " " + " " + " " + " " );
               System.out.print(uts[i]);
               System.out.print(" " + " " + " " + " " + " " + " " + " " );
               System.out.print(uas[i]);
               System.out.print(" " +" " + "\t" + " " + " " + (float)nilaiAkhir[i] +" " + " " + " ");
               System.out.print(grade[i]);
               System.out.println("");
            }      
    }
    
    public static void writeFile(int[] dataMhs, String[]namaMhs, double[]tugas, double[]uts ,double[]uas, double[]nilaiAkhir, String[]grade)throws Exception{
        
        FileWriter fileTulis = new FileWriter("datainput.txt");
           
            fileTulis.write("\t\t\t\tDAFTAR NILAI\n");
            fileTulis.write("\t\t\t\tDAFTAR NILAI\n");
            fileTulis.write("-----------------------------------------------"
                    + "------------------------------------\n");
            fileTulis.write("No \tNama Mahasiswa\t\t\tNilai\t\t\tGrade\n");
            fileTulis.write("\t\t\t----------------------------------------\n");
            fileTulis.write("\t\t\t" + " "   + "Tugas      " + "Uts        " + "Uas     " + "   Akhir\n" );
            fileTulis.write("\n");
            fileTulis.write("===================================================================================\n");

           for(int i = 0 ; i < tugas.length; i++) {
               fileTulis.write(dataMhs[i] + "\t");
               fileTulis.write(namaMhs[i] + "\t" + "");
               fileTulis.write(" " + "\t" + " " );
               fileTulis.write(tugas[i]+"");
               fileTulis.write("\t" + " " + " " + " " + " " );
               fileTulis.write(uts[i] + "");
               fileTulis.write(" " + " " + " " + " " + " " + " " + " " );
               fileTulis.write(uas[i]+"");
               fileTulis.write(" " +" " + "\t" + " " + " " + (float)nilaiAkhir[i] + " " +" " + " " + " ");
               fileTulis.write(grade[i]);
               fileTulis.write("\n");
            }
           fileTulis.close();   
    }
    
    private static void outWriten(int[] dataMhs, String[]namaMhs, double[]tugas, double[]uts ,double[]uas, double[]nilaiAkhir, String[]grade)throws Exception {
        FileReader in = new FileReader("datainput.txt");
        FileWriter out = new FileWriter("daftanilai.txt");
        
        int baca = in.read();
        while(baca != -1) {
            out.write(baca);
            baca = in.read();
        }
        in.close();
        out.close();
    }

    

}

