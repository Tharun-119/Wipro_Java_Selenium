package DAY5;

interface Swim{
	void swim(); // this is abstract method and needs to be implemented 
	
	default void run() { // this is default method it can be used in other class or overridden
		System.out.println("running");

	}
	static void jump() { //this is a static method and belongs to this interface only
		System.out.println("skipping");

	}
}
class Workouts implements Swim {
	public void swim() {
		System.out.println("he is swimming");

	} 
}

public class InterfaceMethods {
	public static void main(String[] args) {
		Workouts exercises = new Workouts();
		exercises.swim();
		exercises.run();
		Swim.jump();
		
			
		}

}
