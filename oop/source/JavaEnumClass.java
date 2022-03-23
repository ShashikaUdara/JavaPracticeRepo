public class JavaEnumClass
{
	enum Level
	{
		Top,
		High,
		Medium,
		Low,
		Bottom
	}

	public void enumExample()
	{
		Level lev = Level.Medium;

		switch(lev)
		{
			case Top:
				System.out.println("case Top");
				break;
			case High:
				System.out.println("case High");
				break;
			case Medium:
				System.out.println("case Medium");
				break;
			case Low:
				System.out.println("case Low");
				break;
			case Bottom:
				System.out.println("case Bottom");
				break;
		}
	}
}