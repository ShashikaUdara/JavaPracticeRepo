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
}