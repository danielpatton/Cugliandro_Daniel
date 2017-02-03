public class Inventory
{   
    private static String Manufacturer, Name, Category;
    private static double UPC, Price;
    public Inventory ()
    {
       Manufacturer = "";
       Name = "";
    }
    public Inventory(String m, String n)
    {
       Manufacturer = m;
       Name = n;
       UPC = (int)(Math.random() * 1000000000) + 1;
    }
    public Inventory(String m, String n, String c, double p)
    {
       Manufacturer = m;
       Name = n;
       Category = c;
       Price = p;
       UPC = (int)(Math.random() * 1000000000) + 1;
    }
    public void setValues (String m, String n, String c, double p)
    {
       Manufacturer = m;
       Name = n;
       Category = c;
       Price = p;
       UPC = (int)(Math.random() * 1000000000) + 1;
    }
    public String toString()
    {
       return "Customer Info...\nItem Manufacturer: " + Manufacturer +
                               "\nItem Name: " + Name +
                               "\nItem Category: " + Category +
                               "\nItem Price: " + Price +
                               "\nUPC#: " + UPC;
    }
}
 