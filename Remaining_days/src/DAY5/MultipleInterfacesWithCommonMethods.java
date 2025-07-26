package DAY5;

interface A {
    void display();
}

interface B {
    void display();
}

interface C {
      void display();
      
}

class D implements A, B, C {
    public void display() {
        System.out.println("Displaying from class C");
    }
}

public class MultipleInterfacesWithCommonMethods {
	public static void main(String[] args) {
		D obj = new D();
		obj.display();
		
	}

}
