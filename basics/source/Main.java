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
	}
}
