package com.latihan.tugas02;

    import java.util.Scanner;

    public class tugas02NilaiAkhir {
        public static void main(String[] args) {
            // Menghitung Nilai Akhir
            //input data
            String siswa;
            
            byte nilaiKeaktifan;
            byte nilaiTugas;
            byte nilaiUjian;
            
                Scanner myobj = new Scanner(System.in);
               
                
            //Memasukan Inputan User
            System.out.println("Masukan Nama anda = ");
            siswa = myobj.nextLine();
            
            System.out.println("Masukan Nilai Keaktifan anda = ");
            nilaiKeaktifan = myobj.nextByte();
            
            System.out.println("Masukan nilai tugas = ");
            nilaiTugas = myobj.nextByte();
            
            System.out.println("Masukan nilai ujian = ");
            nilaiUjian = myobj.nextByte();
            
            //output
            System.out.println("\n");
            System.out.println("===========================================");
            
            
           float hasilKeaktifan = nilaiKeaktifan * (float)0.2;
           float hasilTugas = nilaiTugas * (float)0.3;
           float hasilUjian = nilaiUjian * (float)0.5;
           float total = hasilKeaktifan + hasilTugas + hasilUjian; 
           
           // nilai keluaran
           
           System.out.println("Siswa yang bernama \t= " + siswa);
           System.out.println("Dengan nilai presentasi yang dihasilkan.");
           System.out.println("Nilai Keaktifan x 20% \t= " + hasilKeaktifan);
           System.out.println("NIlai tugas x 30% \t= " + hasilTugas);
           System.out.println("Nilai ujian x 50% \t= " + hasilUjian); 
           
           
            System.out.println("Jadi Siswa yang bernama " + siswa + "\n"
                    + "Memperoleh nilai akhir sebesar " + total);
            
            System.out.println("===========================================")
                
            
            
            
            
        }
    }
    