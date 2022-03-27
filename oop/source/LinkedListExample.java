import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample
{
	public LinkedListExample()
	{
		System.out.println("Constructor - LinkedListExample()");
	}

	public void linkedListMethod()
	{
		System.out.println("public void linkedListMethod()");
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("ant");
		animals.add("bear");
		animals.add("bee");
		animals.add("bird");
		animals.add("butterfly");
		animals.add("camel");
		animals.add("cat");
		animals.add("caterpillar");

		for(int i=0; i<animals.size(); i++)
		{
			System.out.println("animals list: " + animals.get(i));
		}

		System.out.println("***************************");
		animals.addFirst("Elephent");
		for(int i=0; i<animals.size(); i++)
		{
			System.out.println("animals list: " + animals.get(i));
		}

		System.out.println("***************************");
		animals.addLast("Lion");
		for(int i=0; i<animals.size(); i++)
		{
			System.out.println("animals list: " + animals.get(i));
		}

		System.out.println("***************************");
		System.out.println("Removed first - " + animals.removeFirst());
		for(int i=0; i<animals.size(); i++)
		{
			System.out.println("animals list: " + animals.get(i));
		}

		System.out.println("***************************");
		System.out.println("Removed last - " + animals.removeLast());
		for(int i=0; i<animals.size(); i++)
		{
			System.out.println("animals list: " + animals.get(i));
		}

		System.out.println("***************************");
		System.out.println("Get first - " + animals.getFirst());
		System.out.println("Get last - " + animals.getLast());
	}

	public void treratorOnLinkedLists()
	{
		LinkedList<String> newList = new LinkedList<String>();
		
		newList.add("ant");
		newList.add("bear");
		newList.add("bee");
		newList.add("bird");
		newList.add("butterfly");
		newList.add("camel");
		newList.add("cat");
		newList.add("caterpillar");

		// creating the iterator
		Iterator itList = newList.iterator();

		while(itList.hasNext())
		{
			System.out.println(itList.next());
		}
	}
}