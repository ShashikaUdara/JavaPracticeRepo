import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample
{
	public HashSetExample()
	{
		System.out.println("Constructor - HashSet()");
	}

	public void hashSetDemo()
	{
		HashSet<String> hsMonths = new HashSet<String>();

		hsMonths.add("January");
		hsMonths.add("February");
		hsMonths.add("March");
		hsMonths.add("April");
		hsMonths.add("May");
		hsMonths.add("June");
		hsMonths.add("July");
		hsMonths.add("August");
		hsMonths.add("September");
		hsMonths.add("October");
		hsMonths.add("November");
		hsMonths.add("December");

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		for(String i : hsMonths)
		{
			System.out.println("hsMonths - " + i);
		}

		// adding duplicate items to the hash set
		hsMonths.add("May");
		hsMonths.add("June");

		// checking
		System.out.println("+++++++++++++++++++ checking +++++++++++++++++++++++");
		for(String i : hsMonths)
		{
			System.out.println("hsMonths - " + i);
		}

		// removing december
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("hsMonths.remove(December)- " + hsMonths.remove("December"));
		System.out.println("+++++++++++++++++++ checking +++++++++++++++++++++++");
		for(String i : hsMonths)
		{
			System.out.println("hsMonths - " + i);
		}

		// checkign if contains the item
		System.out.println("hsMonths.contains(December)- " + hsMonths.contains("December"));
		System.out.println("hsMonths.contains(January)- " + hsMonths.contains("January"));

		System.out.println("++++++++++++++++++++++++ clearing ++++++++++++++++++++++++++++");
		System.out.println("hsMonths.size() before clear- " + hsMonths.size());
		hsMonths.clear();
		System.out.println("hsMonths.size() after clear- " + hsMonths.size());
	}

	public void iteratorOnHashSet()
	{
		System.out.println("++++++++++++++++ public void iteratorOnHashSet()");
		HashSet<String> newSet = new HashSet<String>();
		newSet.add("January");
		newSet.add("February");
		newSet.add("March");
		newSet.add("April");
		newSet.add("May");
		newSet.add("June");
		newSet.add("July");
		newSet.add("August");
		newSet.add("September");
		newSet.add("October");
		newSet.add("November");
		newSet.add("December");

		// creating the iterator
		Iterator<String> itNewSet = newSet.iterator();

		System.out.println("Item 1: " + itNewSet.next());
		System.out.println("Item 2: " + itNewSet.next());
		System.out.println("Item 3: " + itNewSet.next());
		System.out.println("Item 4: " + itNewSet.next());
		System.out.println("Item 5: " + itNewSet.next());
	}

	public void iteratorOnHashSet2ndMethod()
	{
		System.out.println("++++++++++++++++ public void iteratorOnHashSet2ndMethod()");
		HashSet<String> newSet = new HashSet<String>();
		newSet.add("January");
		newSet.add("February");
		newSet.add("March");
		newSet.add("April");
		newSet.add("May");
		newSet.add("June");
		newSet.add("July");
		newSet.add("August");
		newSet.add("September");
		newSet.add("October");
		newSet.add("November");
		newSet.add("December");

		// creating the Set value set
		// Set iterSet = newSet.entrySet();
		// creating the iterator
		Iterator itNewSet = newSet.iterator();

		while(itNewSet.hasNext())
		{
			System.out.println(itNewSet.next());
		}
	}
}