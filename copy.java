import java.lang.*;



class Employee implements Cloneable
{
    public int EID;
    public String Ename;
    public int ESalary;

    public Employee(int id, String str, int no)
    {
        this.EID = id;
        this.Ename = str;
        this.ESalary = no;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class copy
{
    public static void main(String a[]) throws Exception
    {
        Employee eobj = new Employee(11,"Sanket",210000);
        System.out.println("EID :"+eobj.EID+ "Name :"+eobj.Ename+ "Salary:"+eobj.ESalary);

        Employee eobjx = (Employee)eobj.clone();
        System.out.println("EID :"+eobjx.EID+ "Name :"+eobjx.Ename+ "Salary:"+eobjx.ESalary);

        eobj.Ename = "Bhawar";
        System.out.println("EID :"+eobjx.EID+ "Name :"+eobjx.Ename+ "Salary:"+eobjx.ESalary);

    }
}