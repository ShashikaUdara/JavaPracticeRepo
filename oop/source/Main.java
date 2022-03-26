import java.time.*;

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
		// EncapsulationClass ecMain = new EncapsulationClass("This is Main");
		// ecMain.setName();
		// System.out.println(ecMain.getName());

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

		// Java Polymorphism
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

		// Inner class example
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();

		oc.outerMethod();
		ic.innerMethod();
		// oc.InnerClass.innerMethod(); // this cannot be done - non-static method innerMethod() cannot be referenced from a static context

		// private inner classed are inaccessible from outside the outer calss
		// OuterClass.PrivateInnerClass pc = oc.new PrivateInnerClass(); // OuterClass.PrivateInnerClass has private access in OuterClass
		// pc.privateInnerMethod(); 

		// accessing the static inner classes statice inner method
		OuterClass.StaticInnerClass.staticClass_StaticInnerMethod();

		// accessing the static inner classes statice inner method
		OuterClass.StaticInnerClass isc = new OuterClass.StaticInnerClass();
		isc.staticClass_NonStaticInnerMethod();


		// Access Outer Class From Inner Class
		// One advantage of inner classes, is that they can access attributes and methods of the outer class
		OuterClass outerObj = new OuterClass();
		OuterClass.InnerClass innerObj1 = outerObj.new InnerClass();
		innerObj1.accessOuterProperties();

		// OuterClass.PrivateInnerClass innerObj2 = outerObj.new PrivateInnerClass(); // this is a private inner class, this cannot be access in the outside of the outer class that holds the private inner class
		// innerObj2.accessOuterProperties();

		OuterClass.StaticInnerClass innerObj3 = new OuterClass.StaticInnerClass();
		innerObj3.accessOuterProperties();
		OuterClass.StaticInnerClass.staticAccessOuterProperties();

		// Java Abstraction
		// Abstract Classes and Methods
		// creating object to access the abstract class
		// AbstractClassExample absCls = new AbstractClassExample(); // this should be an error
				// D:\personal\JavaPracticeRepo\oop\source>javac -d ../class Main.java
		// Main.java:126: error: AbstractClassExample is abstract; cannot be instantiated
		                // AbstractClassExample absCls = new AbstractClassExample(); // this should be an error

		// try accessing through the child class
		ChildClass cc = new ChildClass();
		cc.abstractMethod(); // overiddn by the chiled class
		cc.simpleChildMethod(); // from the child class
		cc.simpleNonAbstractMethod(); // from parent abstract class

		// Java Interface
		PetFromAnimalInterface pfai = new PetFromAnimalInterface();
		pfai.makeSound();
		pfai.moveFast();

		// Java Enums
		// Enum inside a Class
		JavaEnumClass jec = new JavaEnumClass();

		// Enum in a Switch Statement
		jec.enumExample();

		// Display Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Today is: " + today);

		// Display Current Time
		System.out.println("Time is: " + LocalTime.now());

		// Display Current Date and Time
		System.out.println("The Date and Time is: " + LocalDateTime.now());

		// ArrayList example
		ArrayListExampleClass alc = new ArrayListExampleClass();
		alc.stringArrayListExample();

		// Java LinkedList
		LinkedListExample ll = new LinkedListExample();
		ll.linkedListMethod();

		// Java HashMap
		HashMapExample hme = new HashMapExample();
		hme.basicHashMap();

		// Java HashSet
		HashSetExample hse = new HashSetExample();
		hse.hashSetDemo();

		// Java Iterator
		hse.iteratorOnHashSet();
	}
}