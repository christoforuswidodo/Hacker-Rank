import java.util.*;

public class CountingSort3{
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

	static void modifyHalfStrings(String modifier, String[] toBeModified){
		for(int i = 0; i < toBeModified.length / 2; i += 1)
			toBeModified[i] = modifier;
	}

	static int[] lessThanNumOccurence(int[] num_to_occurence){
		int[] accumulate = new int[num_to_occurence.length];
		for (int i = 0; i < num_to_occurence.length; i+=1){
			int total = 0;
			for (int j = 0; j <= i; j += 1){
				total += num_to_occurence[j];
			}
			accumulate[i] = total;
		}
		return accumulate;
	} 

	static String[] mapStringToSortedInt(int[] arr, String[] strings){
		int[] count = countOccurence(arr);
		int[] startPosition = lessThanNumOccurence(count);
		printArray(startPosition);
		String[] sortedString = new String[strings.length];
		for(int i = 0; i < startPosition.length; i += 1){
			int pos = startPosition[i];
			System.out.println(pos);
			for(int k = 0; k < arr.length; k+=1){
				if (arr[k] == i){
					sortedString[pos] = strings[k];
					pos += 1;
				}
			}
		}
		return sortedString;
	}

	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
           System.out.println("");
    }

    static void printArray(String[] ar) {
        for(String n: ar){
           System.out.print(n+" ");
        }
           System.out.println("");
    }


	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        String[] strings = new String[n];
        for(int i=0;i<n;i++){
           ar[i]=in.nextInt();
           strings[i] = in.nextLine();
        }
        modifyHalfStrings("-", strings);
        String[] sorted = mapStringToSortedInt(ar,strings);
        printArray(strings);

    }

}