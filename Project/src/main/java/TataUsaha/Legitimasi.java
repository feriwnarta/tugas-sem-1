/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TataUsaha;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Feri Winarta
 */
public class Legitimasi {   
    void cetak() throws IOException{
        FileReader write = new FileReader("LegitimasiSem1.txt");
        BufferedReader buff = new BufferedReader(write);
        
        String data = buff.readLine();
        while(data != null) {
            System.out.println(data);
            data = buff.readLine();
        }
    }
    
}
