public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("it's main");

		// // calling threaded child class
		// JavaThreadsClass tc = new JavaThreadsClass();
		// tc.run();

		// // calling class implementes by the runnable interface
		// JavaRunnableInterface ri = new JavaRunnableInterface();
		// ri.run();

		// using seperate thread controller class to keep main clean
		ThreadControllerClass tcl = new ThreadControllerClass();
		// tcl.controlThreadByThreads();

		// Using Timer in Threads
	}
}