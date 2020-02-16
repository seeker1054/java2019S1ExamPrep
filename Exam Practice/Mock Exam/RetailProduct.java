public class RetailProduct extends Product
{
	private String manufacturer;
	public RetailProduct()
	{
		super();
		setManufacturer("None");
	}
	
	public RetailProduct(String barcode, String name, int unitprice, String manufacturer)
	{
		super(barcode,name,unitprice);
		setManufacturer(manufacturer);
	}
	
	public void setManufacturer(String text)
	{
		this.manufacturer = text;
	}
	
	public String getManufacturer()
	{
		return this.manufacturer;
	}
	
	public double calculatePrice()
	{
		return super.getPrice() + super.getPrice()*0.15;
	}
}