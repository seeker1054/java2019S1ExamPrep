public abstract class Product
{
	private String barcode;
	private String name;
	private int unitprice;
	
	
	public Product()
	{
		setBarcode("000000000000");
		setName("unnamed");
		setPrice(0);
	}
	
	public Product(String barcode, String name, int unitprice)
	{
		setBarcode(barcode);
		setName(name);
		setPrice(unitprice);
	}
	public abstract double calculatePrice();
	
	public void setBarcode(String barcode)
	{
		this.barcode = barcode;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(int price)
	{
		this.unitprice = price;
	}
	
	public String getBarcode()
	{
		return this.barcode;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getPrice()
	{
		return this.unitprice;
	}
}