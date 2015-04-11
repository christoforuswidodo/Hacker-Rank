import java.util.*;

public class SherlockWatson{
	//Version 1 : Without Rotation
	static int findAfterRotate(int[] input, int index, int rotateTimes){
		int inputLength = input.length;
		int findInitPos = getValidModulus((index - rotateTimes), inputLength);
		return input[findInitPos];
	}

	static int getValidModulus(int a, int b){
		int result = a % b;
		if (result < 0)
			result = b + result;
		return result;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] inputIntegers = new int[n];
		int[] queries = new int[q];
		for(int i = 0 ; i < n; i += 1){
			inputIntegers[i] = in.nextInt();
		}
		for(int i = 0; i < q; i += 1){
			queries[i] = in.nextInt();
		}
		for(int i = 0; i < q; i += 1){
			int result = findAfterRotate(inputIntegers, queries[i], k);
			System.out.println(result);
		}
	}
}