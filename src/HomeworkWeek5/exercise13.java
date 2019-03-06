package HomeworkWeek5;

public class exercise13 {

	public class bankAccount {

		String name;
		double balance;

		public void deposit(double amount) {
			balance = balance + amount;
		}

		public void withdrawl(double amount) {
			balance = balance - amount;
		}

		bankAccount ben = new bankAccount();

		bankAccount hal = new bankAccount();

		public void transfer(bankAccount account, double transfer) {

			if (transfer >= 5) {
				this.balance -= 5; // fee of 5 dollar per transfer
				if (this.balance >= transfer) {
					account.balance += transfer; // destination account + transfer money
					this.balance -= transfer; // origin account - transfer money
				}

				else if (this.balance - 5 < transfer) {
					account.balance += this.balance;
					this.balance = 0;
				}

			}

		}
	}

}
