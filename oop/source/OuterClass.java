// Java Inner Classes
// In Java, it is also possible to nest classes (a class within a class)

public class OuterClass
{
	private String sName = "Udara Abeyrathne";
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

	public void invokeInnerClassPrivateFunction()
	{
		PrivateInnerClass pc = new PrivateInnerClass();
		pc.accessOuterProperties();
	}

	protected void testMethod(String sMethod, String sMessage)
	{
		System.out.println("The message from inner " + sMethod + " is: " + sMessage);
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

		// accessing outer classes private and protected methods
		public void accessOuterProperties()
		{
			System.out.println("The name is: " + sName);
			testMethod("public normal method", "This is InnerClass");
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

		// accessing outer classes private and protected methods
		public void accessOuterProperties()
		{
			System.out.println("The name is: " + sName);
			testMethod("private normal method", "This is PrivateInnerClass");
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

		// accessing outer classes private and protected methods
		public void accessOuterProperties()
		{
			OuterClass oc = new OuterClass();
			System.out.println("The name is: " + oc.sName);
			oc.testMethod("public static method", "This is StaticInnerClass");
		}

		// following method is a static one to access the outer properties
		public static void staticAccessOuterProperties()
		{
			OuterClass oc = new OuterClass();
			System.out.println("The name is: " + oc.sName);
			oc.testMethod("public static method(static)", "This is StaticInnerClass");
		}
	}
}