import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Name of the class has to be "Main" only if the class is public. */
class SortingAltiMetrik {
	public static void main(String[] args) throws java.lang.Exception {
		int[] ar = { -5, 10, -3, 12, -9, 5, 90, 0, 1 };
		System.out.println("Before Sorting:"+Arrays.toString(ar));
		int n = ar.length;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			if(ar[i] >=0)
				result.add(ar[i]);
		}
		
		Collections.sort(result);
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(ar[i] >= 0)
			{
				ar[i] = result.get(j);
				j++;
			}
		}
		System.out.println("After Sorting:"+Arrays.toString(ar));
	}

}
