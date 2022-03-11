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

	// static methosd example
	public static void staticMethodExample()
	{
		System.out.println("Calling staticMethodExample()");
	}
}