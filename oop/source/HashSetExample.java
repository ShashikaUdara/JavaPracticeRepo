import java.util.HashSet;

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

		System.out.println("++++++++++++++++++++++++ clearing ++++++++++++++++++++++++++++");
		System.out.println("hsMonths.size() before clear- " + hsMonths.size());
		hsMonths.clear();
		System.out.println("hsMonths.size() after clear- " + hsMonths.size());
	}
}