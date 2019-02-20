package HomeworkWeek4;

public class toStringBankAccount {

	public String toString() {
		
	    if (balance > 0) {
	        return String.format("%s, $%.2f", name, balance);
	    } 
	    else  if (balance < 0) {
	        return String.format("%s, -$%.2f", name, -balance);
	    } 
	    else {
	        return name + ", $0.00";
	    }
}
