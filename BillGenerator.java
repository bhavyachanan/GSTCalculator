class BillGenerator implements PriceCalculator
{

	int calculateBill(Product product)
	{
		return product.getQuantity()*(product.getPrice()+(product.getPrice() * product.getSlab()/100))
	}

	public static void main (String[] args)
	{
		
		
		
		Category category = new Category("Food" ,  new Slab(18));
		Product rice = new Product("Rice",2,5000,category);
		Product wheat =new Product ("Wheat", 5, 6000, category);

		BillGenerator bill = new BillGenerator();
		System.out.println(bill.calculate(rice));
		AssertVale(11800,bill.calculate(rice)); // for testing

	}
}
