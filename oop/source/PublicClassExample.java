public class PublicClassExample
{
	private String sPrivateVariable = "This is private";
	protected String sProtectedVariable = "This is protected";
	public PublicClassExample()
	{
		System.out.println("public Constructor : PublicClassExample()");
	}

	private PublicClassExample( String someVal)
	{
		System.out.println("private Constructor : PublicClassExample(): " + someVal);
	}

	protected PublicClassExample( int someInt, String someVal)
	{
		System.out.println("private Constructor : PublicClassExample(): " + someInt + " | " + someVal);
	}

	public void sampleMethodPublic(String someVal)
	{
		System.out.println("sampleMethodPublic(String someVal): " + someVal);
	}

	// private and protected examples created here

	// this function can only be accessed by this class scope
	private void sampleMethodPrivate(String someVal)
	{
		System.out.println("sampleMethodPrivate(String someVal): " + someVal);
	}

	// this function can only be accessed by this packge scope and by the sub(child) classes
	protected void sampleMethodProtected(String someVal)
	{
		System.out.println("sampleMethodProtected(String someVal): " + someVal);
	}

	// accessing above two methods in this class
	public void accessProtectedAndPrivate()
	{
		// all methods and constructors should be accessible in this region
		PublicClassExample pcePrivate = new PublicClassExample("Private String from same class");
		PublicClassExample pceProtected = new PublicClassExample(12, "Protected String from same class");

		pcePrivate.sampleMethodPrivate("Private obj from same class");
		pcePrivate.sampleMethodProtected("Private obj from same class");

		pceProtected.sampleMethodPrivate("Protected obj from same class");
		pceProtected.sampleMethodProtected("Protected obj from same class");

		System.out.println("pcePrivate.sPrivateVariable: " + pcePrivate.sPrivateVariable);
		System.out.println("pcePrivate.sProtectedVariable: " + pcePrivate.sProtectedVariable);
		System.out.println("pceProtected.sPrivateVariable: " + pceProtected.sPrivateVariable);
		System.out.println("pceProtected.sProtectedVariable: " + pceProtected.sProtectedVariable);
	}
}