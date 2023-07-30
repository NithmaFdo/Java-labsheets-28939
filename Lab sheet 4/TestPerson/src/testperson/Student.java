/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testperson;

public class Student extends Person
{
    private String Course;

    public Student(String Name, int Id, String Course) {
        super(Name, Id);
        this.Course=Course;
    }
    
    public String getCourse()
    {
        return Course;
    }
    
    public void setCourse(String Course)
    {
        this.Course=Course;
    }
}
