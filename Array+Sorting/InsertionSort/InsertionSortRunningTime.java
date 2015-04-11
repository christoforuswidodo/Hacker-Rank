import java.util.*;

public class InsertionSortRunningTime{
	static int totalShift = 0;
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

	static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i += 1){
			if (i == arr.length - 1)
				System.out.println(Integer.toString(arr[i]));
			else
				System.out.print(Integer.toString(arr[i]) + " ");
		}
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

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int arrSize = Integer.parseInt(in.nextLine());	
		int[] inputIntegers = new int[arrSize];
		String[] inputString = (in.nextLine()).split(" ");
		for (int i = 0; i < arrSize; i += 1){
			inputIntegers[i] = Integer.parseInt(inputString[i]);
		}
		// place rightmost element to its appropriate location
		for (int i = 1; i < arrSize; i += 1){
			insertSortElement(inputIntegers, i);
		}
		System.out.println(totalShift);
	}

}