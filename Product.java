class Product{
	String name;
	int quantity;
	int price;
	Category category;

	//constructor

	//getters and setters
	
	Product(String name , int quantity , int price, Category category)
	{
		this.name = this.name;
		this.quantity = quantity;
		this.price = price;
		
		this.category = category;
	}
	
	int getPrice()
	{
		return this.price;
	}
	
	int getQuantity()
	{
		return this.quantity;
	}

int getSlab()
{
return category.getSlab();
}
}
