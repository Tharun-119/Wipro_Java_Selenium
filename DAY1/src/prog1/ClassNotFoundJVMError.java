package prog1;

class ClassNotFoundJVMError {
	public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
    	ClassNotFoundJVMError calc = new ClassNotFoundJVMError;
        int sum = calc.add(3, 4);
        System.out.println("Sum = " + sum);
    }
}
