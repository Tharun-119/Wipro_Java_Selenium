package DAY5;
interface Add {
	void addition(int a, int b);	
}
interface Sub {
	void subtraction(int a , int b);
}
interface Mulpy {
	void multiplication(int a , int b);
}

class Calculator implements Add , Sub , Mulpy {
	public void addition (int a , int b) {
		System.out.println("sum is : " + (a + b));

	}
	public void subtraction (int a , int b) {
		System.out.println("subtraction is : " + (a - b)); 

	}
	public void multiplication (int a , int b) {
		System.out.println("multiplication is : " + (a * b));

	}
	
}

public class MultipleInterfaceDifferentMethods {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.addition(7, 3);
		calculator.subtraction(10, 5);
		calculator.multiplication(5, 6);
		
	}

}
