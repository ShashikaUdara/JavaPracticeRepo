import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class ArrayListExampleClass
{
	public ArrayListExampleClass()
	{
		System.out.println("Constructor - ArrayListExampleClass()");
	}

	public void stringArrayListExample()
	{
		String sItem;
		Scanner numObj = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int count = numObj.nextInt();
		System.out.println("\n");

		Scanner strObj = new Scanner(System.in);
		ArrayList<String> itemList = new ArrayList<String>();
		for(int i=0; i<count; i++)
		{
			System.out.print("Enter item #" + (i+1));
			sItem = "List item #" + (i+1) + " - ";
			sItem += strObj.nextLine();
			itemList.add(sItem);
		}

		System.out.println("Item list...");
		for(int i=0; i<count; i++)
		{
			System.out.println(itemList.get(i));
		}
	}

	public void iteratorOnArrayList()
	{
		System.out.println("++++++++++++++++++++++++++++ public void iteratorOnArrayList()");
		String sMonth = "";
		ArrayList<String> listItems = new ArrayList<String>();

		listItems.add("January");
		listItems.add("February");
		listItems.add("March");
		listItems.add("April");
		listItems.add("May");
		listItems.add("June");
		listItems.add("July");
		listItems.add("August");
		listItems.add("September");
		listItems.add("October");
		listItems.add("November");
		listItems.add("December");

		// creating the iterator
		Iterator<String> itList = listItems.iterator();

		while(itList.hasNext())
		{
			sMonth = itList.next();
			System.out.println("sMonth- " + sMonth);
			if(sMonth.equals("June") || sMonth.equals("October"))
			{
				itList.remove();
			}
		}

		Iterator<String> itList2 = listItems.iterator();

		while(itList2.hasNext())
		{
			System.out.println("Updated ArrayList - " + itList2.next());
		}
	}

}