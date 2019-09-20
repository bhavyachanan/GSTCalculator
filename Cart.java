class Cart
{
static int totalBill=0;
public static int PriceCalculator(int quantity, int price , int slab)

{

int prodTotal= quantity *(price + (price*slab/100));
totalBill+=prodTotal;
return prodTotal;
}

}
