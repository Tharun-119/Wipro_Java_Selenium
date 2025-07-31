package DAY9;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student5 implements Serializable
{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class DeseralizationDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fileIn = new FileInputStream("C:\\Users\\navee\\Downloads\\Wipro Training\\Example.txt");
		ObjectInputStream input = new ObjectInputStream(fileIn); 
		
	   //Read the object and cast it back to Student5
        Student3 student = (Student3) input.readObject();
		
		input.close();
		fileIn.close();
		
		System.out.println("Deserialized Student ");
		System.out.println("Name: " + student.getName());
	    System.out.println("Age: " + student.getAge());
		
	}

}
