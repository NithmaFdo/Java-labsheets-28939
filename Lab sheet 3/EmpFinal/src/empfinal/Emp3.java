
package empfinal;

public class Emp3 {
    private String EmpName;
    private double Bonus;
    private double EmpSalary;
    
    public Emp3(String EmpName,double Bonus,double EmpSalary)
    {
        this.EmpName=EmpName;
        this.Bonus=Bonus;
        this.EmpSalary=EmpSalary;
    }
    
    public String getEmpName()
    {
        return EmpName;
    }
    
    public void setEmpName(String EmpName)
    {
        this.EmpName=EmpName;
    }
    public double getEmpSalary()
    {
        return EmpSalary;
    }
    
    public void setEmpSalary(double EmpSalary)
    {
        this.EmpSalary=EmpSalary;
    }
    public double getBonus()
    {
        return Bonus;
    }
    
    public double calculateBonus()
    {
        return EmpSalary+Bonus;
    }
    
    
    
}
