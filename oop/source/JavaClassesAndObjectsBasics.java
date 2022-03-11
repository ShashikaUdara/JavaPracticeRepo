public class JavaClassesAndObjectsBasics
{
	int iA;
	String sB;

	// constructors and overloaded constructors
	public JavaClassesAndObjectsBasics()
	{
		System.out.println("Without signature");
	}

	public JavaClassesAndObjectsBasics(int iA)
	{
		this.iA = iA;
		System.out.println("this.iA: " + this.iA);
	}

	public JavaClassesAndObjectsBasics(int iA, String sB)
	{
		this.iA = iA;
		this.sB = sB;
		System.out.println("this.iA: " + this.iA + " and this.sB: " + this.sB);
	}

	// static method example
	public static void staticMethodExample()
	{
		System.out.println("Calling staticMethodExample()");
	}

	// Access Modifiers - controls the access level
	// Non-Access Modifiers - do not control access level, but provides other functionality

	// public classes and default can be accessed by any other class in the context
	public void accessPublicClass()
	{
		// accessing public class methods in the outside of the main class
		PublicClassExample pceClassesAndObjects = new PublicClassExample();
		pceClassesAndObjects.sampleMethodPublic("Classes and Objects");

		// accessing default class methods in the outside of the main class
		DefaultClassExample dceClassesAndObjects = new DefaultClassExample();
		dceClassesAndObjects.sampleMethodDefault("Classes and Objects");
	}
}