public class RetailProduct extends Product
{
  private String manufacturer;

  public RetailProduct()
  {
    this("000000000000", "", "", 0);
  }

  public RetailProduct(String no, String nm, String man, int up)
  {
    super(no, nm, up);
    setManufacturer(man);
  }

  //set methods and get methods

  public void setManufacturer(String man)
  {
    manufacturer = man;
  }

  public String getManufacturer()
  {
    return manufacturer;
  }

  public int calculateTax(int TAXRATE)
  {
    return (int)(getUnitPrice() * TAXRATE/100.0);
  }

  public int calculateTotalCost(int TAXRATE)
  {
    return (getUnitPrice() + calculateTax(TAXRATE));
  }

  public String getOutputString()
  {
    return super.getName() + " from " + getManufacturer() + ", unit price: " + super.getUnitPrice() + "c, total price: c";
  }

  public int compareTo(Product other)
  {
    String field1 = getBarcodeNumber().charAt(0) + getName();
    String field2;
    char field2ProductCode = other.getBarcodeNumber().charAt(0);

    if(field2ProductCode == '2')
    {
      field2 = field2ProductCode + other.getName() + ((WeightBasedProduct)other).getWeight();

    }
    else
    {
      field2 = field2ProductCode + other.getName();
    }
    return field1.compareTo(field2);
  }

  public static void main(String[] args)
  {
    RetailProduct prod1 = new RetailProduct("178030640224", "Milk 1L", "Clover", 1550);
    System.out.println(prod1.getOutputString());
  }
}
