/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empfinal;


public class EmpFinal {

    
    public static void main(String[] args) {
        Emp3 x = new Emp3("Nithma Fernando" ,6500,55000);
        
        System.out.println("Name: " +x.getEmpName());
        System.out.println("Salary: " +x.getEmpSalary());
        System.out.println("Bonus: " +x.getBonus());
        System.out.println("Total Salary: " +x.calculateBonus());
    }
    
}
