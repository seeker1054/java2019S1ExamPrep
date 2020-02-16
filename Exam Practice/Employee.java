public class Employee extends Person
{
    public String department;
    public Employee()
    {
        super();
        setDepartment("Default");
        
    }

    public Employee(String department, String name, int ID)
    {
        super(name, ID);
        setDepartment(department);
        
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment()
    {
        return this.department;
    }

    public String nameplus2()
    {
        return getDepartment() + " + 2";
    }


    public String toString()
    {
        return super.getname() + " " + super.getID() + " " + getDepartment();
    }

    public static void main(String arg[])
    {

    }
}