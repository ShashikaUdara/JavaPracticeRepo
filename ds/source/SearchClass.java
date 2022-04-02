public class SearchClass
{
	public SearchClass()
	{
		System.out.println("Constructor SearchClass");
	}

	public void binarySearch(int[] inputArr, int searchVal)
	{
		int midIndex = 0;
		int midNumber = 0;
		int leftIndex = 0;
		int rightIndex = inputArr.length;

		while(leftIndex <= rightIndex)
		{
			midIndex = (inputArr.length)/2;
			midNumber = inputArr[midIndex];

			if(midNumber == searchVal)
			{
				return midIndex;
			}
		}
	}
}