 class Category
{
	String name;
	Slab slab;

	//constructor
	
	Category(String name, Slab slab)
	{
		this.name = name;
		this.slab=slab;
	}
	
	String getName()
	{
		return this.name;
	}
	
	int getSlab()
	{
		return this.slab.getSlabValue();
	}

	//getters and setters

}
