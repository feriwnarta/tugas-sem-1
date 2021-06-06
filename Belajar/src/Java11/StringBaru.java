/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java11;

/**
 *
 * @author Feri Winarta
 */
public class StringBaru {
    public static void main(String[] args) {
        String teks = "asd";
        
        System.out.println(teks.repeat(60));
        
        
        var anh = "adad adada adadad";
        
        System.out.println(anh.strip() + "asddeasd" + "adadad");
    }
}
