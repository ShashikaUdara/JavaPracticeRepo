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
	}
}