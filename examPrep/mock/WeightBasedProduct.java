public class WeightBasedProduct extends Product
{
  private int weight;

  public WeightBasedProduct()
  {
    this("000000000000", "", 0, 0);
  }

  public WeightBasedProduct(String no, String nm, int up, int wt)
  {
    super(no, nm, up);
    setWeight(wt);
  }

  //variable methods

  public int getWeight()
  {
    return weight;
  }

  public void setWeight(int wt)
  {
    weight = wt;
  }

  public int calculateTax(int TAXRATE)
  {
    return (int)(getUnitPrice() * (getWeight()/1000) * TAXRATE/100.0);
  }

  public int calculateTotalCost(int TAXRATE)
  {
    return (int)(getUnitPrice() * (getWeight()/1000) + calculateTax(TAXRATE));
  }

  public String getOutputString()
  {
    return super.getName() + ", unit price " +super.getUnitPrice() + "c/kg, weight: " + getWeight() + "grams, total price: c";
  }

  public int compareTo(Product other)
  {
    String field1 = getBarcodeNumber().charAt(0) + getName() + getWeight();
    String field2;


    if(other instanceof WeightBasedProduct)
    {
      field2 = other.getBarcodeNumber().charAt(0) + other.getName() + ((WeightBasedProduct)other).getWeight();
    }
    else
    {
      field2 = other.getBarcodeNumber().charAt(0) + other.getName();
    }
    return field1.compareTo(field2);
  }

  public static void main(String[] args)
  {
    WeightBasedProduct prod1 = new WeightBasedProduct("245134867531", "Bananas", 4300, 540);
    System.out.println(prod1.getOutputString());
  }
}
