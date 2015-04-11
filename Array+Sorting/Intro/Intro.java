import java.util.*;

public class Intro{
	static int getIndex(int[] arr, int val){
		for(int i = 0; i < arr.length; i += 1){
			if (val == arr[i])
				return i;
		}
		return 0;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int val = Integer.parseInt(in.nextLine());
		int arrSize = Integer.parseInt(in.nextLine());	
		int[] inputIntegers = new int[arrSize];
		String[] inputString = (in.nextLine()).split(" ");
		for (int i = 0; i < arrSize; i += 1){
			inputIntegers[i] = Integer.parseInt(inputString[i]);
		} 
		System.out.println(getIndex(inputIntegers, val));

	}
}