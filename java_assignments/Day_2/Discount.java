
class Discount
{
	public float calculatePercentage(int newItem)
	{
		float discount=newItem*(float) 0.35;
		float newItemPrice=newItem-discount;
		return newItemPrice;
	}
}