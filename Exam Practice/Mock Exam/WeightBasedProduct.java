public class WeightBasedProduct extends Product
{
	private int weight;
	public WeightBasedProduct()
	{
		super();
		
	}
	
	public WeightBasedProduct(String barcode, String name, int unitprice, int weight)
	{
		super(barcode,name,unitprice);
		
	}
	
	public void setWeight(int text)
	{
		this.weight = text;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	
	public double calculatePrice()
	{
		double cost = (super.getPrice()/100)*(this.getWeight()/1000);
		return cost + cost*0.15;
	}
}