public class Main
{
	public static void main(String[] args)
	{
		int[] arrTempArrayInput = {23,45,56,89,12,56,65,5,432,78};

		System.out.println("it's main");
		SortClass sort = new SortClass();

		for(int i=0; i<arrTempArrayInput.length; i++)
		{
			System.out.print(arrTempArrayInput[i] + " - ");
		}

		int[] sortedArr = sort.bubbleSort(arrTempArrayInput);
		System.out.println("");

		for(int i=0; i<sortedArr.length; i++)
		{
			System.out.print(sortedArr[i] + " - ");
		}

		// quickSort
		int[] arrQuick = {5,8,45,56,89,61,45,56,78,12,65,99,45,28,99,22,55,66,333,45,878,125,63,458,56,25};
		System.out.println("\n\nBefore");
		for(int i=0; i<arrQuick.length; i++)
		{
			System.out.print(arrQuick[i] + " - ");
		}
		// quickSorting
		sort.quickSort(arrQuick, 0, arrQuick.length);

		System.out.println("\n\nAfter");
		for(int i=0; i<arrQuick.length; i++)
		{
			System.out.print(arrQuick[i] + " - ");
		}
	}
}