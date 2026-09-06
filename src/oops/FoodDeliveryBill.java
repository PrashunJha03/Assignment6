package overloading;


class FoodOrder
{
	
	
	void calculateBill(double foodPrice)
	{
		double bill = foodPrice * 1;
		System.out.println("Total Bill for the food : " + bill);
	}
	
	void calculateBill(double foodPrice, int quantity)
	{
		double bill = foodPrice * quantity;
		System.out.println("Total Bill for the food : " + bill);
	}
	
	void calculateBill(double foodPrice, int quantity, double deliveryCharge)
	{
		double bill = (foodPrice * quantity) + deliveryCharge;
		System.out.println("Total Bill for the food : " + bill);
	}
}



public class FoodDeliveryBill {
	
	public static void main(String[] args) {
		FoodOrder f = new FoodOrder ();
		f.calculateBill(100);
		f.calculateBill(100, 5);
		f.calculateBill(100, 2, 50);
	}
	

}
