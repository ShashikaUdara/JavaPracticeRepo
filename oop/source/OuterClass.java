// Java Inner Classes
// In Java, it is also possible to nest classes (a class within a class)

public class OuterClass
{
	public OuterClass()
	{
		System.out.println("Outer class constructor");
	}

	public void outerMethod()
	{
		System.out.println("outerMethod()");

		// this methos can access the privete inner class
		PrivateInnerClass pc = new PrivateInnerClass();
		pc.privateInnerMethod();
	}
	public class InnerClass
	{
		public InnerClass()
		{
			System.out.println("Inner class constructor");
		}

		public void innerMethod()
		{
			System.out.println("innerMethod()");
		}
	}

	private class PrivateInnerClass
	{
		public PrivateInnerClass()
		{
			System.out.println("Private Inner class constructor");
		}

		public void privateInnerMethod()
		{
			System.out.println("privateInnerMethod()");
		}
	}

	// Static Inner Class - can access without creating object
	public static class StaticInnerClass
	{
		public StaticInnerClass()
		{
			System.out.println(" Static Inner class constructor");
		}

		public static void staticClass_StaticInnerMethod()
		{
			System.out.println("staticClass_StaticInnerMethod()");
		}

		public static void staticClass_NonStaticInnerMethod()
		{
			System.out.println("staticClass_NonStaticInnerMethod()");
		}
	}
}