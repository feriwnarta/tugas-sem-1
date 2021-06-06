package com.latihan.tugas02;
    
    import java.util.Scanner;

    public class tugas02Balok {
        public static void main(String[] args) {
            // Membat inputan balok
            // Mendeklarasikan Variabel 
            byte panjang;
            byte lebar;
            byte tinggi;
            
            String satuan = "cm3";
                
                Scanner Balok;
                Balok = new Scanner (System.in);
           
             //Memasukan Inputan User
                System.out.println("************************************************ \n"
                        + "|||Program Penghitungan volume dan luas balok||| \n"
                        + "************************************************");
                
                System.out.println("Masukan panjang Balok: ");
                panjang = Balok.nextByte();
                System.out.println(satuan);
                
                
                System.out.println("Masukan Lebar Balok : ");
                lebar = Balok.nextByte(); 
                System.out.println(satuan);
                
                System.out.println("Masukan Tinggi Balok : ");
                tinggi = Balok.nextByte(); 
                System.out.println(satuan + "\n");
             //Mencetak Hasil
             
            float hasilVolume = panjang * lebar * tinggi;
            float hasilLuas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
                System.out.println("==========================================");
            
                System.out.println("Hasilnya dari data tersebut adalah");
                System.out.printf("Hasil nilai volume = " + hasilVolume + "cm3" + "\n");
                System.out.printf("Hasil luas = " + hasilLuas + "cm3 \n");
                
                System.out.println("==========================================");
        
        }
    }