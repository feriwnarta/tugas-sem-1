/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;


class Office {
    
    void showOffice() {
        System.out.println("lantai 20"); 
    }
}

class Company extends Office{
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    class Employee {
        private String name;
        
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getName() {
            return this.name;
        }
        
        public String getCompany() {
            return Company.this.getName();
        }
        
        public void showKantor() {
            Company.super.showOffice();
        }
        
    }
}

public class InnetApp {
    public static void main(String[] args) {
        Company company1 = new Company();
        company1.setName("Perusahan bekawan-kawan");
        
        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Feri Winarta");
        
        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
        employee1.showKantor();
        
        
        
        
        Company company2 = new Company();
        
        
        Company.Employee emp2 = company2.new Employee();
        
        
    }
}
