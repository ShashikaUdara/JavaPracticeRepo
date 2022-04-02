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
			midIndex = (rightIndex + leftIndex)/2;
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

	public int recursiveBinarySearch(int[] inputArr, int searchVal, int leftIndex, int rightIndex)
	{
		int midIndex = (rightIndex + leftIndex)/2;
		int midNumber = inputArr[midIndex];

		if(leftIndex > rightIndex)
		{
			return -1;
		}

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

		return recursiveBinarySearch(inputArr, searchVal, leftIndex, rightIndex);
	}
}