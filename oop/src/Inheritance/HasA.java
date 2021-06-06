/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

class Senjata {
    private int peluru;
    private int berat;
    
    void reload() {
        peluru += 30;
    }
    
    void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    void setBerat(int berat) {
        this.berat = berat;
    }
    
    void showBerat() {
        System.out.println(berat);
    }
    
    int getBerat() {
        return berat;
    }
    
    void showPeluru() {
        System.out.println(peluru);
    }
}

class Sniper {
    Senjata sjt;
    private String name;
    
    void setName(String name) {
        this.name = name;
    }
    
    void showName() {
        System.out.println(name);
    }
    
    void setSenjata(Senjata sjt) {
        this.sjt = sjt;
    }
    
    void showBerat() {
        System.out.println(sjt.getBerat());
    }
    
}


public class HasA { 
    public static void main(String[] args) {
        Senjata s = new Senjata();
        
        Sniper snp = new Sniper();
        snp.setName("AWM");
        snp.showName();
        snp.setSenjata(s);
        snp.sjt.setBerat(12);
        snp.showBerat();
        snp.sjt.setPeluru(25);
        snp.sjt.reload();
        snp.sjt.showPeluru();
        
    }    
}
