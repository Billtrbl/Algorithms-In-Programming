package HomeworkWeek4;

public class transferBankAccount{

public void transfer(BankAccount fromAccount, double transferAmount) {
	if(fromAccount.balance >= 5) {
		fromAccount.balance = fromAccount.balance - 5;
		transferAmount = transferAmount - 5;
		if(fromAccount.balance < transferAmount) {
			transferAmount = fromAccount.balance;
		}
		balance = balance + transferAmount;
		fromAccount.balance = fromAccount.balace - transferAmount;
	}
}
}