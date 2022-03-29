// this is the thread controller class
import java.util.Timer;
import java.util.TimerTask;

public class ThreadControllerClass extends TimerTask
{
	public ThreadControllerClass()
	{
		System.out.println("Constructor - ThreadControllerClass");
		// scheduleTasksThreads();
		// scheduleTasksRunnable();
		// System.out.println("Creted the ThreadControllerClass object");
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
		while(tc.isAlive())
		{
			System.out.println("T-Waiting...");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("e - " + e);
			}
		}
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
		while(thread.isAlive())
		{
			System.out.println("R-Waiting...");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("e - " + e);
			}
		}
	}

	// Using Timer in Threads
	public void run()
	{
		controlThreadByThreads();
		controlThreadByRunnable();
	}
}