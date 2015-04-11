import java.util.*;
public class ClosestNumber{

	static int findMin(int[] arr){
		int min = arr[0];
		for(int i = 1; i < arr.length; i += 1){
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	static int[] constructDiffArray(int[] sorted){
		int[] diffArr = new int[sorted.length-1];
		for(int i = 0; i < sorted.length - 1; i += 1){
			diffArr[i] = Math.abs(sorted[i]-sorted[i+1]);
		}
		return diffArr;
	}

	static int[][] genSmallestDifferenceArrayPair(int[] sorted){
		int[] diffArray = constructDiffArray(sorted);
		int minimum = findMin(diffArray);
		int count = 0;
		for (int i = 0; i < diffArray.length; i += 1){
			if (diffArray[i] == minimum)
				count+=1;
		}
		int[][] pairs = new int[count][];
		int j = 0;
		for (int i = 0; i < diffArray.length; i += 1){
			if (diffArray[i] == minimum){
				pairs[j] = new int[]{sorted[i], sorted[i + 1]};
				j += 1;
			}
		}
		return pairs;
	}
	//-------------------------------- Insertion Sort Method ---------------------------------
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

	static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	// ---------------End Of InsertionSort Method and Helper----------------------

	//---------------------------------Print Array Pair---------------------------
    static void printArrayPair(int[][] ar) {
        for(int i = 0; i < ar.length; i+=1){
        	printPair(ar[i]);
        }
        System.out.println("");
    }

    static void printPair(int[] pair){
    	for(int n: pair)
           System.out.print(n+" ");
    }

    static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }

    static void printArray(long[] ar) {
         for(long n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }

    //-----------------------------End of Print Array Pair-------------------------

    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar, 0, ar.length-1);
           int[][] smallerPairs = genSmallestDifferenceArrayPair(ar);
           printArrayPair(smallerPairs);
    }
}