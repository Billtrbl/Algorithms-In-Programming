package HomeworkWeek4;

public class transferBankAccount {
	
	public void transfer(BankAccount account, double transfer) {
	    if (transfer >= 5) {
	        this.balance -= 5;
	        if (this.balance >= transfer) {
	            account.balance += transfer;
	            this.balance -= transfer;
	        } else if (this.balance - 5 < transfer) {
	            account.balance += this.balance;
	            this.balance = 0;
	        } 
	        this.transactions++;
	        account.transactions++;
	    }

}
