package DAY4;

public class CreditCardPayments extends Payment {
	
	public CreditCardPayments(double amount)
	{
		super(amount);
	}
	
	public void makePayment()
	{
		System.out.println("Processing the Credit Card Payment");
		printReceipt();
	}

}