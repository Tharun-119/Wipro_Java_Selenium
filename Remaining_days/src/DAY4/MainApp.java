package DAY4;

import DAY4.CreditCardPayments;
import DAY4.BillGenerator;
import DAY4.UPI;

public class MainApp {
	public static void main(String[] args) {
		CreditCardPayments creditCardPayments = new CreditCardPayments(1500);
		creditCardPayments.makePayment();
		
		UPI upiPayment = new UPI(2000);
		upiPayment.makePayment();
		
		
		BillGenerator.displayHeader();
		
		BillGenerator billGenerator = (amount) -> {
			System.out.println("Amount: " + amount);
			
			System.out.println("Thank you for the Payment");
		};
	}

}


