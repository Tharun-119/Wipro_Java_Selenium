package DAY9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student3 implements Serializable
{
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Student5 [age=" + age + ", name=" + name + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
	
}

public class SeralizationDemo {
	
	public static void main(String[] args) throws IOException
	{
		Student3 s3 = new Student3();
		s3.setAge(23);
		s3.setName("Naveen");
		
		try 
		{
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\navee\\Downloads\\Wipro Training\\Example.txt");
		ObjectOutputStream output = new ObjectOutputStream(out);
		output.writeObject(s3);

        System.out.println("Serialized data: " + s3);
		System.out.println("Object has been serialized and written to file!");
		
		output.close();
		out.close();
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	}

}
