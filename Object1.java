import java.lang.*;

class Employee
{
    public String name;
    public int Salary;

    public Employee(String str, int no)
    {
        this.name = str;
        this.Salary = no;

    }

    public String toString()
    {
        return name+"->"+Salary;
    }
}

class Object1
{
    public static void main(String a[])
    {
        Employee eobj = new Employee("Sanket",21000);
        System.out.println(eobj.toString());
    }
}