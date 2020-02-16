import java.io.*;
public abstract class Product implements Taxable, Serializable, Comparable<Product>
{
  public static final int TAXRATE = 15;
  private String barcodeNumber;
  private String name;
  private int unitPrice;

  public Product()
  {
    this("000000000000", "", 0);
  }

  public Product(String no, String nm, int up)
  {
    setBarcodeNumber(no);
    setname(nm);
    setUnitPrice(up);
  }

  //set methods
  public void setBarcodeNumber(String no)
  {
    barcodeNumber = no;
  }

  public void setname(String nm)
  {
    name = nm;
  }

  public void setUnitPrice(int up)
  {
    unitPrice = up;
  }

  //get methods
  public String getBarcodeNumber()
  {
    return barcodeNumber;
  }

  public String getName()
  {
    return name;
  }

  public int getUnitPrice()
  {
    return unitPrice;
  }

  public abstract int calculateTotalCost(int TAXRATE);
}
