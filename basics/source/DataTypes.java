public class DataTypes
{
	int total = 0;

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
		boolean bPass = true; 	// 1 bit
		char cA = 'A'; 	// 2 bytes
		String sGreating = "Welcome to java practice repo"; 	// not a premitive data type. Cannot define the size of String type

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

	// Java Type Casting
	// Type casting is when you assign a value of one primitive data type to another type.
	// In Java, there are two types of casting:

	// 	- Widening Casting (automatically) - converting a smaller type to a larger type size
	// 	- byte -> short -> char -> int -> long -> float -> double
		
	// 	- Narrowing Casting (manually) - converting a larger type to a smaller size type
	// 	- double -> float -> long -> int -> char -> short -> byte
	public boolean javaTypeCastingExample()
	{
		// Widening Casting int -> double
		int iA = 125;
		double dB = iA;
		System.out.println("int iA: " + iA);
		System.out.println("double dB: " + dB);

		// Narrowing  Casting double -> int
		double dC = 125.235d;
		int iD = (int)dC;
		System.out.println("double dC: " + dC);
		System.out.println("int iD: " + iD);

		return true;
	}

	// Java Strings
	public boolean javaStringExample()
	{
		// String Length
		String sName = "Udara Abeyrathne";
		System.out.println("sName length: " + sName.length());

		// toUpperCase() and toLowerCase()
		System.out.println("sName toUpperCase: " + sName.toUpperCase());
		System.out.println("sName toLowerCase: " + sName.toLowerCase());

		// Finding a Character in a String
		System.out.println("sName place \'Abe\'(6): " + sName.indexOf("Abe"));

		// String Concatenation
		String sIntro = "My name is";
		String sDescription = sIntro + " " + sName;
		System.out.println(sDescription);

		// Special Characters
		String sSpecialCharAdded = sIntro + " \'" + sName + "\'";
		System.out.println(sSpecialCharAdded);

		// Adding Numbers and Strings
		String sA = "Apple";
		String sB = "Mango";
		int iA = 12;
		int iB = 4;

		// type 1 - String + int + String + int
		String sType1 = sA + iA + sB + iB;

		// type 2 - int + int + String + String
		String sType2 = iA + iB + sA + sB;

		// type 3 - String + String + int + int
		String sType3 = sA + sB + iA + iB;

		// type 4 - String + int + int + String
		String sType4 = sA + iA + iB + sB;

		System.out.println("String sType1 = sA + iA + sB + iB: " + sType1);
		System.out.println("String sType2 = iA + iB + sA + sB: " + sType2);
		System.out.println("String sType3 = sA + sB + iA + iB: " + sType3);
		System.out.println("String sType4 = sA + iA + iB + sB: " + sType4);

		return true;
	}

	// Java Math
	public boolean javaMathExample()
	{
		float iA = 6.25f;
		float iB = 2.25f;
		// Get Maximum out of two numbers
		System.out.println("Math.max: " + Math.max(iA, iB));

		// Get Minimum out of two numbers
		System.out.println("Math.min: " + Math.min(iA, iB));

		// Get Square root of a number
		System.out.println("Math.sqrt of iA: " + Math.sqrt(iA));
		System.out.println("Math.sqrt of iB: " + Math.sqrt(iB));

		// Get Absolute (positive) value of a number
		System.out.println("Math.abs of iA: " + Math.abs(iA));
		System.out.println("Math.abs of iB: " + Math.abs(-1*iB));

		// Generate Random Numbers
		System.out.println("Math.random(): " + Math.random());

		return true;
	}

	// Java Method Overloading
	// multiple methods can have the same name with different parameters
	public int functionOverrideExample()
	{
		System.out.println("functionOverrideExamplr()");
		return 0;
	}

	public int functionOverrideExample(int iAge)
	{
		System.out.println("functionOverrideExamplr(int iAge): " + iAge);
		return 0;
	}

	public int functionOverrideExample(int iAge, String sName)
	{
		System.out.println("functionOverrideExamplr(int iAge, String sName): " + iAge + " : " + sName);
		return 0;
	}

	// java recursion
	// following example is going to keep add
	public int sum(int number)
	{
		if(number > 0)
		{
			// total = number + sum(number--);
			return number + sum(number-1);
		}
		else
		{
			return 0;
		}
	}

	public int[] fibonacci(int range)
	{
		int iLast = 1;
		int iNLast = 0;
		int iTemp = 0;
		int fiboArr[] = new int[range+1];

		for(int i=0; i<range; i++)
		{
			if(i == 0 || i == 1)
			{
				System.out.print(i + ", ");
				fiboArr[i] = i;
				continue;
			}
			System.out.print(iNLast + iLast + ", ");
			iTemp = iNLast + iLast;
			fiboArr[i] = iTemp;
			iNLast = iLast;
			iLast = iTemp;
		}

		System.out.println("");
		return fiboArr;
	}
}
