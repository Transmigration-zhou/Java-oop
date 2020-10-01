package 异常;

public class BankExceptionDemo4 {

	public static void main(String args[]) {
		try {
			Bank bank = new Bank();
			bank.deposite(50);
			bank.withdrawal(100);
			System.out.println("Withdrawal successful!");
		} catch (InsufficientFundsException e) {
			System.out.println(e.toString());
		}
	}
}

class InsufficientFundsException extends Exception {

	private Bank excepbank;

	private double excepAmount;

	InsufficientFundsException(Bank ba, double amount) {
		excepbank = ba;
		excepAmount = amount;
	}

	public String toString() {
		String str = "The balance was " + excepbank.getBalance()
				+ ", and the withdrawal was " + excepAmount;
		return str;
	}
}

class Bank {

	double balance; // 余额

	public void deposite(double amount) { // 存钱
		if (amount > 0.0) {
			balance += amount;
		}
	}

	public void withdrawal(double amount) // 取款
			throws InsufficientFundsException {
		if (balance < amount) {
			throw new InsufficientFundsException(this, amount);
		}
		balance = balance - amount;
	}

	public double getBalance() { // 获取余额
		return balance;
	}
}


