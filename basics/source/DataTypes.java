public class DataTypes
{
	public boolean checkIntegerTypes()
	{
		System.out.println("checkIntegerTypes");
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
		System.out.println("checkFloatingPointTypes");
		float fAirPressure = 2.56f; 	// 4 bytes
		double dPI = 3.14159265359d;	// 8 bites
		System.out.println("float value: " + fAirPressure);
		System.out.println("double value: " + dPI);

		return true;
	}

	public boolean checkOtherTypes()
	{
		System.out.println("checkOtherTypes");
		boolean bPass = true;
		System.out.println("boolean value: " + bPass);

		return true;
	}
}
