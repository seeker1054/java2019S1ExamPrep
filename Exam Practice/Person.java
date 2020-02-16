public abstract class Person
{
    private String name;
    private int ID;

    protected Person()
    {
        setname("Default");
        setID(0);
    }

    protected Person(String name, int ID)
    {
        setname(name);
        setID(ID);
    }

    public void setname(String name)
    {
        this.name = name;
    }

    public void setID(int ID)
    {
        if (ID < 100)
        {
            this.ID = ID; 
        }  
        else
        {
            throw new MyException("No ID over 100!");
        }
    }

    public String getname()
    {
        return this.name;
    }

    public int getID()
    {
        return this.ID;
    }

    public abstract String nameplus2();

    public String toString()
    {
        return getname() + " " + getID();
    }

    public static void main(String arg[])
    {
        System.out.println("Hello");

    }
    
}