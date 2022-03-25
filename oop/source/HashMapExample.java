import java.util.HashMap;

public class HashMapExample
{
	public HashMapExample()
	{
		System.out.println("Constructor - HashMapExample()");
	}

	public void basicHashMap()
	{
		HashMap<String, String> hmMonths = new HashMap<String, String>();

		// putting values
		hmMonths.put("Jan", "January");
		hmMonths.put("Feb", "February");
		hmMonths.put("Mar", "March");
		hmMonths.put("Apr", "April");
		hmMonths.put("May", "May");
		hmMonths.put("Jun", "June");
		hmMonths.put("Jul", "July");
		hmMonths.put("Aug", "August");
		hmMonths.put("Sep", "September");
		hmMonths.put("Oct", "October");
		hmMonths.put("Nov", "November");
		hmMonths.put("Dec", "December");

		// getting selected item
		System.out.println("hmMonths.get(Feb) - " + hmMonths.get("Feb"));

		// removing selected item
		System.out.println("hmMonths.remove(Feb) - " + hmMonths.remove("Feb"));

		// size of the HashMap
		System.out.println("hmMonths.size() - " + hmMonths.size());

		// Loop Through a HashMap
		// get key set
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		for(String i : hmMonths.keySet())
		{
			System.out.println("hmMonths.keySet() - " + i + " - " + hmMonths.get(i));
		}

		// get value set
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		for(String i : hmMonths.values())
		{
			System.out.println("hmMonths.values() - " + i);
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		hmMonths.clear();
		System.out.println("hmMonths.size() after clearing - " + hmMonths.size());
	}
}