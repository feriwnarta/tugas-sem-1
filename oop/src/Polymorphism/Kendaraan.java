/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Feri Winarta
 */
public class Kendaraan {
    private int jmlhBan;
    private String color;
    protected byte pengemudi = 20;
    private String produsen;
    
    protected void run() {
        System.out.println("Kendaraan akan berjalan");
    }
    
    protected void startEngine() {
        System.out.println("Suara mesin");
    }

    public int getJmlhBan() {
        return jmlhBan;
    }

    public void setJmlhBan(int jmlhBan) {
        this.jmlhBan = jmlhBan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getPengemudi() {
        return pengemudi;
    }

    public void setPengemudi(byte pengemudi) {
        this.pengemudi = pengemudi;
    }

    public String getProdusen() {
        return produsen;
    }

    public void setProdusen(String produsen) {
        this.produsen = produsen;
    }
}

class Mobil extends Kendaraan{
    
  public void setJmlhBan(int jmlhBan) {
      super.setJmlhBan(jmlhBan);
  }
  
  public void setColor(String color) {
      super.setColor(color);
  }
  
  public void run() {
      System.out.println("Brem Brem Brem");
  }
  
}

class Pesawat extends Kendaraan{
    protected byte pengemudi;
    
  public void showPengemudi() {
      System.out.println(pengemudi);
  }
  
  public void tampilSuper() {
      System.out.println(super.pengemudi);
  }
          
  public void setJmlhBan(int jmlhBan) {
     super.setJmlhBan(jmlhBan);
  }
  
  public void setColor(String color) {
      super.setColor(color);
  }
  
  public void run() {
      System.out.println("swing Swing Swing");
  }
  
  public void ketinggian() {
      System.out.println("30.000 Kaki");
  }
          
  
  
  public static void main(String[] args) {
      Kendaraan k = new Mobil();
      k.setColor("Merah");
      k.setJmlhBan(4);
      k.run();
      k.pengemudi = 1;
      System.out.println(k.pengemudi);
      Pesawat p = new Pesawat();
      p.tampilSuper();
      System.out.println(k.getColor());
      System.out.println(k.getJmlhBan());
      
      k = new Pesawat();
      k.setColor("Putih");
      k.setJmlhBan(2);
      k.run();
      
//      saat melakuka poly dinamis, hanya bisa memanggil method yg 
//      sudah di overide
//      k.ketinggian();
      System.out.println(k.getColor());
      System.out.println(k.getJmlhBan());
      
//      Pesawat p = new Pesawat();
//      p.ketinggian();
      
  }
}



