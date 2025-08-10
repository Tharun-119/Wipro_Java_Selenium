package DAY11;

import java.io.FileReader;
import java.io.IOException;


public class FileReader {

	public static void main(String[] args) throws IOException
	{
		FileReader reader = new FileReader("C:\\Users\\kesir\\eclipse-workspace\\Wipro_Java_Selenium\\Example.txt");
		int ch;
		
		while((ch = reader.read())!=-1)
		{
			System.out.println((char)ch);
		}
		
		reader.close();
		
	}
}
