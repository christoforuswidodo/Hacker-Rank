import java.util.*;

public class CountingSort{
	static int[] countOccurence(int[] arr){
		//make an array holder of 99 values
		int[] countMany = new int[100];
		for(int i = 0; i < arr.length; i+=1)
			countMany[arr[i]] += 1;
		return countMany;
	}

	static void countingSort(int[] arr){
		int[] num_to_occurence = countOccurence(arr);
		int k = 0;
		while (k < arr.length){
			for(int i = 0; i < num_to_occurence.length; i += 1){
				for(int l = 0; l < num_to_occurence[i]; l += 1){
					arr[k] = i;
					k++;
				}
			}
		}
	}

	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
           System.out.println("");
    }

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
           ar[i]=in.nextInt(); 
        }
        countingSort(ar);
        printArray(ar);
    }

}