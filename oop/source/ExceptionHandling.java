public class ExceptionHandling
{
	public ExceptionHandling()
	{
		System.out.println("Constructor - ExceptionHandling()");
	}

	public void basicExceptionHandled()
	{
		System.out.println("public void basicExceptionHandled()");
		int[] numList = {1, 5, 6, 4};

		try
		{
			System.out.println(numList[10]);
		}
		catch(Exception e)
		{
			System.out.println("Error - " + e);
		}
		finally
		{
			System.out.println("Do the rest of the execution");
		}
	}

	public void throwingException()
	{
		int iAge = 15;

		try
		{
			if(iAge > 18)
			{
				System.out.println("You are allowd to drink");
			}
			else
			{
				System.out.println("You are allowd to drink");
				throw new ArithmeticException("Worning - Drinking alert!");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException - " + e);
		}
	}
}