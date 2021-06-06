/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TataUsaha;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Feri Winarta
 */
public class AmbilBuku {
    Scanner input = new Scanner(System.in);
  
    void ambil() throws IOException {
        FileWriter write = new FileWriter("ambilbuku.txt",true);
        BufferedWriter buff = new BufferedWriter(write);
        
        System.out.println("Nama : ");
        String nama = input.next();
        buff.write(nama + " sudah mengambil buku");
        buff.newLine();
        buff.flush();  
        buff.newLine();
    }
}
