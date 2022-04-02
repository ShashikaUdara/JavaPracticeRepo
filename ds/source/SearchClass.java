public class SearchClass
{
	public SearchClass()
	{
		System.out.println("Constructor SearchClass");
	}

	public int binarySearch(int[] inputArr, int searchVal)
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

			if(midNumber < searchVal)
			{
				leftIndex = midIndex+1;
			}
			else
			{
				rightIndex = midIndex-1;
			}
		}

		return -1;
	}
}