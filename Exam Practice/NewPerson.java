import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.io.File;
import java.io.PrintWriter;
import java.io.*;

public class NewPerson
{
    public static final int MAX_PEOPLE = 3;
    public static void main(String arg[]) throws Exception
    {
        int personID;
        String personName;

        Person[] people = new Person[MAX_PEOPLE];
        

        people[0] = new Customer("Moskava","Rudolph Venter", 14);
        people[1] = new Customer("Jordan","Luis Pederson", 88);
        people[2] = new Customer("Luttern","Jasmine Dawson", 42);
        
        Arrays.sort(people);

        for(int i = 0; i< MAX_PEOPLE; i++)
        {
            System.out.println(people[i]);
        }
        System.out.println();
    
        Employee Rolf = new Employee("IT", "Rolf Van Oldcountry", 23);
        System.out.println(Rolf);
        Customer Adam= new Customer("Springfield", "Adam Green", 23);
        System.out.println(Adam);
        System.out.println();
        System.out.println(Adam.checknames(Adam.getname()));

        try
        {
            Customer Jake= new Customer("New York", "Jake Smith", 111);
            System.out.println(Jake);
        }
        catch(MyException ex)
        {
            System.out.println(ex);
        }
        try{
            System.out.println(8/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
		
		//creating file
        File myfile = new File("text.txt");
        if(myfile.exists() == false)
        {
            PrintWriter output = new PrintWriter(myfile);
            output.print(1);
            output.print(2);
            output.close();
        }
		
		//reading from file
        int i = 0;
        int[] integers = new int[100];
        Scanner input = new Scanner(myfile);
        while(input.hasNext())
        {
            int currentint = input.nextInt();
            integers[i] = currentint;
            //System.out.println();
            i++;
        }
        input.close();

        String text = "1 2 1 2 1 2";
        
        System.out.println(text.replaceAll("1","3"));

        System.out.println();

        for(int j = 0; j< 5; j++)
        {
            System.out.println(integers[j]);
        }
		//Serialising objects
		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat")))
		{
			output.writeUTF("John");
			output.writeDouble(85.5);
			output.writeObject(new Date()); 
		}
		
		try(ObjectInputStream inputobj = new ObjectInputStream(new FileInputStream("object.dat")))
		{
			String name = inputobj.readUTF();
			Double age = inputobj.readDouble();
			Date nowdate = (Date)(inputobj.readObject());
			System.out.println(name + " " + age + " " + nowdate); 
		}
		
		
		
		
        
        
        
        

    }
}