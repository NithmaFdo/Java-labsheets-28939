/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testemployee;


public class TestEmployee {

    public static void main(String[] args) {
        Employee x=new Employee(28939, "Mr.Bogdan","Data Science Engineer");
        Employee y=new Employee(28282, "Ms. Bird","Software Engineer");
        
        x.setempId(28939);
        x.setempName("Mr.Bogdan");
        x.setempDesignation("Data Science Engineer");
        
        y.setempId(28282);
        y.setempName("Ms.Bird");
        y.setempDesignation("Software Engineer");
        
        
        System.out.println("Employee 1");
        System.out.println("Name: " +x.getempName());
        System.out.println("Employee ID: " +x.getempId());
        System.out.println("Designation: " +x.getempDesignation());
        
        System.out.println();
        
        System.out.println("Employee 2");
        System.out.println("Name: " +y.getempName());
        System.out.println("Employee ID: " +y.getempId());
        System.out.println("Designation: " +y.getempDesignation());
        
        
    }
    
}
