package DAY4;

public abstract class Payment {
	
	protected double amount;
	
	public Payment(double amount)
	{
		this.amount=amount;
	}
	
	public void printReceipt()
	{
		System.out.println("Payment $ " + amount + "processed.");
	}
	
	
	public abstract void makePayment();
	

}