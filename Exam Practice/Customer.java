public class Customer extends Person implements SameName, Comparable<Person>
{
    public String Branch;
    public Customer()
    {
        super();
        setBranch("Default");
        
    }

    public String checknames(String othername)
    {
        if (this.getname() == othername)
        {
            return "Names Match";
        }
        else
        {
            return "Names do not match!";
        }
    }

    public Customer(String Branch, String name, int ID)
    {
        super(name, ID);
        setBranch(Branch);
        
    }
    public int compareTo(Person other)
    {
        if(this.getID() > other.getID())
        return 1;
        if(this.getID() == other.getID())
        return 0;
        
        return -1;
    }

    public void setBranch(String Branch)
    {
        this.Branch = Branch;
    }

    public String getBranch()
    {
        return this.Branch;
    }

    public String toString()
    {
        return super.getname() + " " + super.getID() + " " + getBranch();
    }

    public String nameplus2()
    {
        return getBranch() + " + 2";
    }

    public static void main(String arg[])
    {

    }
}