// This class can class cannot be accessed via object, but only through the chiled class
abstract class AbstractClassExample
{
	public AbstractClassExample()
	{
		System.out.println("Constructor - AbstractClassExample()");
	}

	public abstract void abstractMethod();

	public void simpleNonAbstractMethod()
	{
		System.out.println("simpleNonAbstractMethod()");
	}
}