import java.util.*;

public class Median{
	static void partition(int[] arr, int start, int end){
		//Base Case, if there is only one element or less int the array just returns
		if ((end - start) <= 0)
			return;
		int swapPos = start;
		// initial is used whether the first bigger value than p has been discovered or not
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
		partition(arr, start, swapPos - 1);
		partition(arr, swapPos + 1, end);
		
	}

	static int partitionFindMedian(int[] arr, int start, int end){
		//Base Case, if there is only one element or less int the array just returns
		if ((end - start) <= 0)
			return arr[(int) ((arr.length - 1) / 2)];
		int swapPos = start;
		// initial is used whether the first bigger value than p has been discovered or not
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
		if (swapPos == (int) ((arr.length - 1) / 2))
			return arr[swapPos];
		else if (swapPos > (int) ((arr.length - 1) / 2))
			return partitionFindMedian(arr, start, swapPos - 1);
		else
			return partitionFindMedian(arr, swapPos + 1, end);
		
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
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
           ar[i]=in.nextInt(); 
        }
        System.out.println(partitionFindMedian(ar, 0, ar.length-1));
	}
}