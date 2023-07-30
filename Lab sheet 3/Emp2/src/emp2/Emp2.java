/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emp2;


public class Emp2 {

    public static void main(String[] args) {
        EmpCons n = new EmpCons("Nithma Fernando" , 23, 650000.50);
        
        System.out.println("Name: " +n.getEmpName());
        System.out.println("Age: " +n.getEmpAge());
        System.out.println("Salary: " +n.getEmpSalary());
        
    }
    
}
