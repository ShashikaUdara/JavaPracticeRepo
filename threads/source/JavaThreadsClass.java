// It can be created by extending the Thread class and overriding its run() method

public class JavaThreadsClass extends Thread
{
	public JavaThreadsClass()
	{
		System.out.println("Constructor - JavaThreadsClass");
	}

	public void run()
	{
		System.out.println("Overrided run method in Thread Class");

		for(int i=0; i<10; i++)
		{
			System.out.println("Thread count: " + (i+1));
		}
	}
}