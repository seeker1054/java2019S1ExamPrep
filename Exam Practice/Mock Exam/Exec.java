import java.util.*;
import java.io.*;
public class Exec
{
	public static void main(String arg[]) throws Exception
	{
		Product[] products = new Product[25];
		/*products[0] = new RetailProduct("178030640224","Milk, 1L",155,"Clover");
		products[1] = new WeightBasedProduct("178030640224","Milk, 1L",155,1000);*/
		File myfile = new File("productdata.txt");
		
		
		try(Scanner input = new Scanner(myfile))
		{
			int i = 0;
			while(input.hasNext())
			{
				String item = input.nextLine();
				String[] parts = item.Split("#");
				if(item[0] == "1")
				{
					products[i] = new RetailProduct(parts[0],parts[1],(int)parts[3],parts[2]);
				}
				else
				{
					products[i] = new WeightBasedProduct(parts[0],parts[1],parts[3],parts[2]);
				}
				
				i++;
			}
		}
		
		input.close();
	}
}