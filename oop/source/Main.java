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

		// accessing default class methods in the main class
		DefaultClassExample dceMain = new DefaultClassExample();
		dceMain.sampleMethodDefault("Main");

		// this is not valied - private cannot be accessed
		// PublicClassExample pceMainPrivate = new PublicClassExample("Private String from main");

		// protected constructors can be accessed by the external classes in the same package
		PublicClassExample pceMainProtected = new PublicClassExample(28, "Protected String from main");

		// pceMainPrivate.sampleMethodPrivate("Private obj from main");
		// pceMainPrivate.sampleMethodProtected("Private obj from main");

		// pceMainProtected.sampleMethodPrivate("Protected obj from main");
		pceMainProtected.sampleMethodProtected("Protected obj from main");

		// System.out.println("pceMainPrivate.sPrivateVariable: " + pceMainPrivate.sPrivateVariable);
		// System.out.println("pceMainPrivate.sProtectedVariable: " + pceMainPrivate.sProtectedVariable);
		// System.out.println("pceMainProtected.sPrivateVariable: " + pceMainProtected.sPrivateVariable);
		System.out.println("pceMainProtected.sProtectedVariable: " + pceMainProtected.sProtectedVariable);

		dceMain.finalExample();

		// Encapsulation examples here
		EncapsulationClass ecMain = new EncapsulationClass("This is Main");
		ecMain.setName();
		System.out.println(ecMain.getName());

		// Java Inheritance (Subclass and Superclass)
		// creating carclass object
		CarClass car = new CarClass();

		// accessing own methods
		car.doDragging();

		// accessing parent methods
		car.honk();
		car.move();
		car.putLights();

		// CarClass carV = new VehicleClass();
		// accessing own methods
		// carV.doDragging();

		// accessing parent methods
		// carV.honk();
		// carV.move();
		// carV.putLights();

		VehicleClass vehicle = new VehicleClass();
		// accessing own methods
		// vehicle.doDragging();

		// accessing parent methods
		vehicle.honk();
		vehicle.move();
		vehicle.putLights();
		vehicle.doDragging();

		VehicleClass objCarV = new CarClass();
		objCarV.honk();
		objCarV.move();
		objCarV.putLights();
		objCarV.doDragging();

		// Java Polymorphism
	}
}