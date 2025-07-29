package DAY7;

class Mul3 implements Runnable 
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("MultiThreading 1");
			
			try 
			{
				Thread.sleep(10);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e.getMessage());
			}
		}
	}
}


class Mul4 implements  Runnable
{
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("MultiThreading 2");
			
			try 
			{
				Thread.sleep(10);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e.getMessage());
			}
		}
	}
}

public class MultithreadingEx2 {
	public static void main(String[] args) 
	{
		Runnable m3 = new Mul3();
		Runnable m4 = new Mul4();
		
		Thread t1 = new Thread(m3);
		Thread t2 = new Thread(m4);
		
		t1.start();
		t2.start();
	}

}
