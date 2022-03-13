// Sample class
// importing newly created packge
package samplePack;

import FirstPackage.FirstPackageClass;

public class SampleClass
{
	public static void main(String[] args)
	{
		System.out.println("SampleClass : main");
		FirstPackageClass fpcSimpleMain = new FirstPackageClass();
		String sStr = fpcSimpleMain.testMethod();
	}
}