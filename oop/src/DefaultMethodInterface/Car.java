/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultMethodInterface;

/**
 *
 * @author Feri Winarta
 */
public interface Car {
    void run();
    void rem();
    void naikGigi();
    void kopling();
    
    
// contoh penggunaan method default dikelas interface agar
// ketika melalkukan penambahan method kelas turunan tidak eror 
// dan tidak wajib mengoveride
    default void safetyBelt() {
        System.out.println("safety belt dan balon belt");
    }
        

}
