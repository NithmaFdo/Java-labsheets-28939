/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testperson;

public class Person {
    private String Name;
    private int Id;
   
    public Person(String Name,int Id)
    {
        this.Name=Name;
        this.Id=Id;
    }
     
    public String getName()
    {
        return Name;
    }
    
    public void setName(String Name)
    {
        this.Name=Name;
    }
    
    public int getId()
    {
        return Id;
    }
    
    public void setId(int Id)
    {
        this.Id=Id;
    }
}
