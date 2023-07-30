/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemployee;

public class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    
    public Employee(int empId,String empName,String empDesignation)
    {
        this.empId=empId;
        this.empName=empName;
        this.empDesignation=empDesignation;
    }
    
    public int getempId()
    {
        return empId;
    }
    
    public void setempId(int empId)
    {
        this.empId=empId;
    }
   
    public String getempName()
    {
        return empName;
    }
    
    public void setempName(String empName)
    {
        this.empName=empName;
    }
    
    public String getempDesignation()
    {
        return empDesignation;
    }
    public void setempDesignation(String empDesignation)
    {
        this.empDesignation=empDesignation;
    }
    
}
