public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("it's main");

		// calling threaded child class
		JavaThreadsClass tc = new JavaThreadsClass();
		tc.run();

		// calling class implementes by the runnable interface
		JavaRunnableInterface ri = new JavaRunnableInterface();
		ri.run();
	}
}