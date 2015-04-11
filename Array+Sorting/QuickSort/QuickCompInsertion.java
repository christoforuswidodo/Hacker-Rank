import java.util.*;

public class QuickCompInsertion{
	static int totalShift = 0;
	static int totalSwap = 0;

	static void shiftRight(int[] arr, int index){
		if (isValidShift(arr, index)){
			arr[index + 1] = arr[index];
			totalShift += 1;
		}
	}

	static boolean isValidShift(int[] arr, int index){
		if (index >= arr.length - 1 || index < 0)
			return false;
		return true;
	}

	static void insertSortElement(int[] arr, int index){
		int element = arr[index];
		index -= 1;
		while (index > -1 && element < arr[index] ){
			shiftRight(arr, index);
			index -= 1;
		}
		arr[index + 1] = element;
	}

	static void partition(int[] arr, int start, int end){
		//Base Case, if there is only one element or less int the array just returns
		if ((end - start) <= 0)
			return;
		int swapPos = start;
		boolean initial = true;
		int p = arr[end];
		//Rearranging array as compared to p with swap
		for (int i = start; i < end; i += 1){
			if (arr[i] > p && initial == true){
				swapPos = i;
				initial = false;
			}
			else if (arr[i] < p){
				swap(arr, swapPos, i);
				swapPos += 1;
			}
		}
		swap(arr, swapPos, end);
		//Recursive Call
		printArray(arr);
		partition(arr, start, swapPos - 1);
		partition(arr, swapPos + 1, end);
		
	}

	static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		totalSwap += 1;
	}

	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
           System.out.println("");
    }

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int[] ar2 = new int[n];
        for(int i=0;i<n;i++){
        	ar[i]=in.nextInt();
        	ar2[i] = ar[i]; 
        }
        partition(ar, 0, ar.length-1);
        for (int i = 1; i < n; i += 1)
			insertSortElement(ar2, i);
		int result = totalShift - totalSwap;
		System.out.println(result);

	}
}