/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emp2;

public class EmpCons {
    private String EmpName;
    private int EmpAge;
    private double EmpSalary;
    
public EmpCons(String EmpName,int EmpAge,double EmpSalary)
{
    this.EmpName=EmpName;
    this.EmpAge=EmpAge;
    this.EmpSalary=EmpSalary;
}

public String getEmpName()
{
    return EmpName;
}
public int getEmpAge()
{
    return EmpAge;
}
public double getEmpSalary()
{
    return EmpSalary;
}
    
}
