
public class Clothes implements GetDressed{

	
	double variation; //this is the price variation based on size
	String size;      //this is the size of dress
	double actualPrice; // this is the price printed on the label
	
	@Override
	public boolean CheckSizeAvailability() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double ActualPrice() {
		// TODO Auto-generated method stub
		
		// the final price of the dress varies based on the size
		double finalPrice = 0;
		switch (size) {
		case "XS":
			variation = 0.75;
			break;

		case "S":
			variation = 0.85;
			break;
		case "L":
			variation = 1.15;
			break;
		case "XL":
			variation = 0.25;
			break;
		default:
			//size M has the price mentioned on the label
			variation = 1;
			break;
		}
		finalPrice = actualPrice * variation;
		return finalPrice;
	}

}
