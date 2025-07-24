package DAY4;

public class UPI extends Payment {

public UPI(double amount)
{
	super(amount);
}

@Override
public void makePayment()
{
	System.out.println("Processing the UPI Payment...");
	printReceipt();
}

	
	
}