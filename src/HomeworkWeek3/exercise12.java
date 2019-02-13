package HomeworkWeek3;

public class exercise12 {
	
	public static int priceIsRight(int[] bids, int price) {
	    int diff = 100000;
	    int bid = 0;
	    
	    for (int i = 0; i < bids.length; i++) {
	        if (bids[i] <= price) {
	            if (price - bids[i] < diff) {
	                bid = bids[i];
	                diff = price - bids[i];
	            }
	        }
	    }
	    
	    if (bid == 0) {
	        return -1;
	    } else {
	        return bid;
	    }
	}

}
