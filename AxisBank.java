package week3.assignments;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Deposit in Axis Bank");
	}
	public static void main(String[] args) {
		
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.saving();
		obj.fixed();
		
	}

}
