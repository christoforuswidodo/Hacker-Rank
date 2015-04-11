import java.util.*;

public class MaxMin{
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

	static int minMaxMin(int[] sorted, int k){
		int min = sorted[k-1] - sorted[0];
		int amount = sorted.length - k - 1;
		for(int i = 1; i < amount; i += 1){
			int diff = sorted[i+k-1] - sorted[i];
			if (diff < min)
				min = diff;
		}
		return min;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] inputs = new int[n];
		for(int i = 0;i < n; i += 1){
			inputs[i] = in.nextInt();
		}
		quickSort(inputs);
		System.out.println(minMaxMin(inputs, k));

	}
}