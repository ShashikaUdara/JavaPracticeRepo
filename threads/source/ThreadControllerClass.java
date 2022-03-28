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
		/* 
			If the class extends the Thread class, the thread can be run by 
		   creating an instance of the class and call its start() method
		*/
		JavaThreadsClass tc = new JavaThreadsClass();
		tc.start();
	}

	public void controlThreadByRunnable()
	{
		System.out.println("public void controlThreadByRunnable()");

		// calling class implementes by the runnable interface
		/*
			If the class implements the Runnable interface, the thread can be run by passing an 
			instance of the class to a Thread object's constructor and then calling the 
			thread's start() method
		*/
		JavaRunnableInterface ri = new JavaRunnableInterface();
		Thread thread = new Thread(ri);
		thread.start();
	}
}