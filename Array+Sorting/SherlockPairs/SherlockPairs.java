import java.util.*;

public class SherlockPairs{
	//Count pairs of same number with different indices
	static int countPairs(int[] sorted){
		int finalCount = 0;
		int count = 1;
		int comparator = sorted[0];
		for(int i = 1; i < sorted.length; i += 1){
			if (comparator != sorted[i]){
				comparator = sorted[i];
				finalCount += 2 * addSeries(count);
				count = 1;
			}
			else
				count += 1;
		}
		finalCount += 2 * addSeries(count);
		return finalCount;
	}

	static int addSeries(int n){
		return (int)  n*(n-1)/2; 
	}


	//----------------------------------QuickSort----------------------------------
	static void quickSort(int[] arr){
		partition(arr, 0, arr.length-1);
	}

	static void partition(int[] arr, int start, int end){
		//Base Case, if there is only one element or less int the array just returns
		if ((end - start) <= 0)
			return;
		int swapPos = end;
		int p = arr[swapPos];
		//Rearranging array as compared to p with swap
		for (int i = start; i < end; i += 1){
			if (arr[i] > p && swapPos == end)
				swapPos = i;
			else if (arr[i] < p && i > swapPos){
				swap(arr, swapPos, i);
				swapPos += 1;
			}
		}
		swap(arr, swapPos, end);
		//Recursive Call
		partition(arr, start, swapPos - 1);
		partition(arr, swapPos + 1, end);
		
	}

	static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
           System.out.println("");
    }

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0 ; i < t; i += 1){
			int n = in.nextInt();
			int[] inputIntegers = new int[n];
			for(int j = 0; j < n; j += 1)
				inputIntegers[j] = in.nextInt();
			quickSort(inputIntegers); // n log n worst case
			System.out.println(countPairs(inputIntegers));
		}
	}
}