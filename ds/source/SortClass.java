import java.util.ArrayList;

public class SortClass
{
	public SortClass()
	{
		System.out.println("Constrctor - SortClass");
	}

	public int[] bubbleSort(int[] arrInput)
	{
		// ArrayList<Integer> newAL = new ArrayList<Integer>();
		int temp = 0;

		// for(int i=0; i<arrInput.length; i++)
		// {
		// 	System.out.println(arrInput[i]);
		// 	newAL.add(arrInput[i]);
		// }

		for(int x=0; x<arrInput.length-2; x++)
		{
			for(int y=0; y<-2-x; y++)
			{
				if(arrInput[y] > arrInput[y+1])
				{
					temp = arrInput[y];
					arrInput[y] = arrInput[y+1];
					arrInput[y+1] = temp;
				}
			}
		}

		return arrInput;
	}

	public void quickSort(int[] arr, int low, int high)
	{
		if(low < high)
		{
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi);
			quickSort(arr, pi+1, high);
		}
	}

	public int partition(int[] arr, int low, int high)
	{
		int iPivot = arr[high-1];
		int i = low - 1;
		int iTemp = 0;

		for(int j=low; j<high-2; j++)
		{
			if(arr[j] < iPivot)
			{
				i++;
				// swap(&arr[i], &arr[j]);
				iTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = iTemp;
			}
		}
		i++;
		// swap(&arr[i], &arr[j]);
		iTemp = arr[i];
		arr[i] = arr[high-1];
		arr[high-1] = iTemp;

		return i;
	}
}