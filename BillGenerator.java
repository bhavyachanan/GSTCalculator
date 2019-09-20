class BillGenerator
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		
		Category c = new Category("Electronics" ,  new Slab(18));
Product p = new Product("Mobile",2,5000,c);
Product p1 =new Product ("TV", 5, 6000, c);

System.out.println(Cart.priceCalculator(p.getQuantity(),p.getPrice(),p.getSlab()));
//assertValue(11800,Cart.priceCalculator(p.getQuantity(),p.getPrice(),p.getSlab())) =>for testing
System.out.println(Cart.priceCalculator(p1.getQuantity(),p1.getPrice(),p1.getSlab()));
System.out.println(Cart.totalBill);
System.out.println(p.getQuantity()*(p.getPrice()+(p.getPrice() * p.getSlab()/100)));
	}
}
