// this is the thread controller class

public class ThreadControllerClass
{
	public ThreadControllerClass()
	{
		System.out.println("Constructor - ThreadControllerClass");
		controlThreadByThreads();
		controlThreadByRunnable();
		System.out.println("Creted the ThreadControllerClass object");
	}

	public void controlThreadByThreads()
	{
		System.out.println("public void controlThreadByThreads()");

		// calling threaded child class
		JavaThreadsClass tc = new JavaThreadsClass();
		tc.run();
	}

	public void controlThreadByRunnable()
	{
		System.out.println("public void controlThreadByRunnable()");

		// calling class implementes by the runnable interface
		JavaRunnableInterface ri = new JavaRunnableInterface();
		ri.run();
	}
}