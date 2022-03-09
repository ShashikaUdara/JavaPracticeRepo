public class DataTypes
{
	public boolean checkIntegerTypes()
	{
		System.out.println("checkIntegerTypes()");
		byte byMark = 89;	// 1 byte
		short shVolumn = 32000;	// 2 bytes
		int iNumber = 125;	// 4 bytes
		long lNICNumber = 911260565L;	// 8 bytes
		System.out.println("byte value: " + byMark);
		System.out.println("short value: " + shVolumn);
		System.out.println("int value: " + iNumber);
		System.out.println("long value: " + lNICNumber);

		return true;
	}

	public boolean checkFloatingPointTypes()
	{
		System.out.println("checkFloatingPointTypes()");
		float fAirPressure = 2.56f; 	// 4 bytes
		double dPI = 3.14159265359d;	// 8 bites
		System.out.println("float value: " + fAirPressure);
		System.out.println("double value: " + dPI);

		return true;
	}

	public boolean checkOtherTypes()
	{
		System.out.println("checkOtherTypes()");
		boolean bPass = true;
		char cA = 'A';
		String sGreating = "Welcome to java practice repo";

		System.out.println("boolean value: " + bPass);
		System.out.println("char value: " + cA);
		System.out.println("String value: " + sGreating);

		return true;
	}

	public boolean checkScientificNumbers()
	{
		System.out.println("checkScientificNumbers()");
		float fPIinto10000 = 3.1415e4f; 	// e stand for the power of 10, 
										// hence the value before 'e' will powerd by 10^the number after 'e' (here it's 4 = 10000)
		double dNumberOfStudents = 25E3d;
		double dHeightOfAStudents = 1.58E2d;
		System.out.println("Scientific float: " + fPIinto10000);
		System.out.println("Scientific double: " + dNumberOfStudents);
		System.out.println("Scientific double: " + dHeightOfAStudents + " cm");

		return true;
	}
}
