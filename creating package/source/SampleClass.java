// Sample class
// importing newly created packge

import FirstPackage.FirstPackageClass;

public class SampleClass
{
	public static void main(String[] args)
	{
		System.out.println("SampleClass : main");
		FirstPackageClass fpcSimpleMain = new FirstPackageClass();
		String sStr = fpcSimpleMain.testMethod();
		System.out.println("This is the output of created package call: " + sStr);
	}
}