/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

class Kendaraan {
    private int jmlhBan;
    private String color;
    byte pengemudi = 10;
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
    byte pengemudi = 1;
    
    void displaySuper() {
        System.out.println(super.pengemudi);
    }
    
    
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
     public void setJmlhBan(int jmlhBan) {
      super.setJmlhBan(jmlhBan);
  }
  
  public void setColor(String color) {
      super.setColor(color);
  }
  
  public void run() {
      System.out.println("swing Swing Swing");
  }
  
}

public class IsA {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan();
        
        Mobil m = new Mobil();
        m.setColor("merah");
        m.setJmlhBan(4);
        m.run();
        System.out.println(m.pengemudi);
        m.displaySuper();
        System.out.println(m.getColor());
        System.out.println(m.getJmlhBan());
        
        Pesawat p = new Pesawat();
        p.setColor("merah");
        p.setJmlhBan(2);
        p.run();
        System.out.println(p.getColor());
        System.out.println(p.getJmlhBan());
                
        
        
    }
}
