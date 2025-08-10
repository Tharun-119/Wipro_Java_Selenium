package DAY11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReader {
	public static void main(String[] args) throws IOException
	{
		BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\kesir\\eclipse-workspace\\Wipro_Java_Selenium\\Example.txt"));
		br.write("Example of File Writer");
		
		br.close();
		System.out.println("Written Successfully");
	}


}
