package DAY4;

public interface BillGenerator {
	
	void generate(double amount);
	
	default void  showBillFormat() {
		System.out.println("-------Bill Receipt-------");
	}
	
	// static method 
	
	static void displayHeader()
	{
		System.out.println("Welcome to Online Billing System");
	}

}