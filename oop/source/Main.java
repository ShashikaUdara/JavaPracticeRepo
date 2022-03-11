public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Here focuses on OOP");
		// JavaClassesAndObjectsBasics.staticMethodExample();

		// creating obj
		// JavaClassesAndObjectsBasics obj = new JavaClassesAndObjectsBasics();
		// obj.staticMethodExample();

		// creating different ojects with different signatures
		// JavaClassesAndObjectsBasics obj1 = new JavaClassesAndObjectsBasics();
		// JavaClassesAndObjectsBasics obj2 = new JavaClassesAndObjectsBasics(5);
		// JavaClassesAndObjectsBasics obj3 = new JavaClassesAndObjectsBasics(12, "Udara Abeyrathne");

		// public classes can be accessed by any other class in the context
		PublicClassExample pceMain = new PublicClassExample();
		pceMain.sampleMethodPublic("Main");

		JavaClassesAndObjectsBasics objPublicAndDefault = new JavaClassesAndObjectsBasics();
		objPublicAndDefault.accessPublicClass();

		DefaultClassExample dceMain = new DefaultClassExample();
		dceMain.sampleMethodDefault("Main");
	}
}