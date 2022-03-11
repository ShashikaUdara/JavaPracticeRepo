class DefaultClassExample
{
	// default class constructor
	DefaultClassExample()
	{
		System.out.println("Constructor : DefaultClassExample()");
	}

	void sampleMethodDefault(String someVal)
	{
		System.out.println("sampleMethodDefault(String someVal): " + someVal);
	}

	// final example
	public void finalExample()
	{
		final double dUGC = 6.67408E-11d;
		final double dPI = 3.1415926d;

		System.out.println(dUGC);
		System.out.println(dPI);

		// dUGC = 50.25; // should give an error here
		// dPI = 50.25; // should give an error here
		// System.out.println(dUGC);
		// System.out.println(dPI);
	}
}