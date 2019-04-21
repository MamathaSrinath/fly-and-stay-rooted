import java.util.*;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GetDressed> cart = new ArrayList<GetDressed> ();
		
		Shoes myShoes = new Shoes();
		Clothes myClothes = new Clothes();
		double checkoutPayment = 0;

		//give my shopping specifications
		myShoes.size = 8;
		myClothes.size = "L";
		myClothes.actualPrice = 1000;
		myShoes.actualPrice = 750;
		
		cart.add(myShoes);
		cart.add(myClothes);

		//calculate the overall amount to be paid
		for (GetDressed getDressed : cart) {
			if (getDressed.CheckSizeAvailability()) {
				checkoutPayment+= getDressed.ActualPrice();
			}
		}
		System.out.println("The payment value at checkout is " + checkoutPayment);
	}

}
