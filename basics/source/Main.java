public class Main
{
	public static void main(String []args)
	{
		System.out.println("This is the start");

		DataTypes dt = new DataTypes();
		dt.checkIntegerTypes();
		dt.checkFloatingPointTypes();
		dt.checkOtherTypes();
		dt.checkScientificNumbers();
		dt.javaTypeCastingExample();
		dt.javaStringExample();
		dt.javaMathExample();
		dt.functionOverrideExample();
		dt.functionOverrideExample(30);
		dt.functionOverrideExample(30, "Udara");
		System.out.println(dt.sum(5));
		int[] iTempArr = dt.fibonacci(20);

		for(int x=0; x<iTempArr.length - 1; x++)
			System.out.println(x+1 + " : " + iTempArr[x]);
	}
}
