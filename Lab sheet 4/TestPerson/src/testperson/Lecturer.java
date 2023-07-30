/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testperson;

public class Lecturer extends Person{

    private String Programme;
    
    public Lecturer(String Name, int Id, String Programme) {
        super(Name, Id);
        this.Programme=Programme;
    }
    
    public String getProgramme()
    {
        return Programme;
    }
     public void setProgramme(String Programme)
     {
         this.Programme=Programme;
     }
}
