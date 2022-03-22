class ChildClass extends AbstractClassExample
{
	public ChildClass()
	{
		System.out.println("Constructor - ChildClass()");
	}

	public void abstractMethod()
	{
		System.out.println("This method has been overriddn by the child class");
	}

	public void simpleChildMethod()
	{
		System.out.println("simpleChildMethod()");
	}
}