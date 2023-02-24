package week5;

public class AxisBank  extends BankInfo {
	public void deposit(int amount) {
		System.out.println("Deposit amount = "+amount);
	}
	public static void main(String[] args) {
		BankInfo details=new AxisBank();
		details.deposit(750000);
		details.fixed(1000);
		details.saving(10000);
	}

}
