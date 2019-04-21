
public class Shoes implements GetDressed{
	//size of the shoes UK sizes
	
	int size;		// shoe size
	double actualPrice; // the price printed on the shoe label
	
	@Override
	public boolean CheckSizeAvailability() {
		// TODO Auto-generated method stub
		//sizes 7 and 11 not in stock
		if (size == 7 || size == 11) return false;
		return true;
	}

	@Override
	public double ActualPrice() {
		// TODO Auto-generated method stub
		//the price remains the same for all sizes
		return actualPrice;
	}

}
