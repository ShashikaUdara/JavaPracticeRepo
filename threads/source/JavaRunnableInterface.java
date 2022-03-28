// Another way to create a thread is to implement the Runnable interface

public class JavaRunnableInterface implements Runnable
{
	public JavaRunnableInterface()
	{
		System.out.println("Constructor - JavaRunnableInterface");
	}
	public void run()
	{
		System.out.println("Overrided run method in Runnable Interface");

		for(int i=0; i<10; i++)
		{
			System.out.println("Runnable count: " + (i+1));
		}
	}
}