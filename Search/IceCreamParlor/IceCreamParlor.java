import java.util.*;

public class IceCreamParlor {

	// static void quickSort(int[] arr){
	// 	partition(arr, 0, arr.length-1);
	// }

	// static void partition(int[] arr, int start, int end){
	// 	//Base Case, if there is only one element or less int the array just returns
	// 	if ((end - start) <= 0)
	// 		return;
	// 	int swapPos = end;
	// 	int p = arr[swapPos];
	// 	//Rearranging array as compared to p with swap
	// 	for (int i = start; i < end; i += 1){
	// 		if (arr[i] > p && swapPos == end)
	// 			swapPos = i;
	// 		else if (arr[i] < p && i > swapPos){
	// 			swap(arr, swapPos, i);
	// 			swapPos += 1;
	// 		}
	// 	}
	// 	swap(arr, swapPos, end);
	// 	//Recursive Call
	// 	partition(arr, start, swapPos - 1);
	// 	partition(arr, swapPos + 1, end);
		
	// }

	// static void swap(int[] arr, int first, int second){
	// 	int temp = arr[first];
	// 	arr[first] = arr[second];
	// 	arr[second] = temp;
	// }

	// public static int binarySearch(int[] sorted, int n) {
	// 	return binarySearch(sorted, n, 0, sorted.length-1);
	// }

	// public static int binarySearch(int[] sorted, int n, int startIndex, int endIndex) {
	// 	int midIndex = (int) ((endIndex + startIndex) / 2);
	// 	System.out.println("midIndex : " + midIndex);
	// 	if (n == sorted[midIndex])
	// 		return midIndex;
	// 	else if (startIndex == endIndex)
	// 		return -1;
	// 	else if (n > sorted[midIndex])
	// 		return binarySearch(sorted, n, midIndex + 1, endIndex);
	// 	else
	// 		return binarySearch(sorted, n, startIndex, midIndex - 1);
	// }

	public static int[] optimizedIceCreams(int[] iceCreams, int money) {
		//quickSort(iceCreams);
		for (int i = 0; i < iceCreams.length; i += 1) {
			for (int j = i+1; j < iceCreams.length; j += 1) {
				if ((iceCreams[i] + iceCreams[j]) == money) {
					//System.out.println("total : " + (iceCreams[i] + iceCreams[j]));
					int[] pair = {i+1, j+1};
					return pair;
				}
			}
		}
		int[] defPair = {0, 0};
		return defPair;
	}

	public static void printPair(int[] pair) {
		System.out.println(pair[0] + " " + pair[1]);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0 ; i < t ; i += 1) {
			int m = in.nextInt();
			int n = in.nextInt();
			int[] iceCreamsCost = new int[n];
			for (int j = 0; j < n; j += 1) {
				iceCreamsCost[j] = in.nextInt();
			}
			printPair(optimizedIceCreams(iceCreamsCost, m));

		}
	}
}