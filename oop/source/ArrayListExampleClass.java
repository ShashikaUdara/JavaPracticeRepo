import java.util.ArrayList;
import java.util.Scanner;

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
			System.out.print("Enter item #" + i+1);
			sItem = "List item #" + i+1 + " - ";
			sItem += strObj.nextLine();
			itemList.add(sItem);
		}

		System.out.println("Item list...");
		for(int i=0; i<count; i++)
		{
			System.out.println(itemList.get(i));
		}
	}

}