/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testperson;

public class TestPerson {

    
    public static void main(String[] args) {
       Student s= new Student("Nimal Perera",28939,"Computer Science");
       Lecturer l=new Lecturer("Naji Sarva",1012,"Data Science");
       
       System.out.println("Student");
       System.out.println("Name: " +s.getName());
       System.out.println("ID: " +s.getId());
       System.out.println("Course: " +s.getCourse());
       System.out.println();
       
       System.out.println("Lecturer");
       System.out.println("Name: " +l.getName());
       System.out.println("ID: " +l.getId());
       System.out.println("Programme: " +l.getProgramme());
    }
    
}
