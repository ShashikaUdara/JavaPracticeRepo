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
	}
}