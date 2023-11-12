import java.util.*;

public class bucketSort{
	
	public static void main(String[] args)
	{
		//int M;
		
		int max=0;
		int inputArray[] = new int[] {8, 2, 5, 3, 0, 2, 15};
		for (int i = 0; i<inputArray.length; i++) {
			
			int temp;
			if (inputArray[i]>max)
				max = inputArray[i];
				
			
		}
		System.out.println(max);
		//System.out.println(Arrays.toString(inputArray));
		int bucketArray[] = new int[max+1];
		//for()
	}

}