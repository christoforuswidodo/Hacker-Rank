import java.util.*;

public class SherlockArray{

	static boolean equilibrium(int[] inputs){
		int totalSum = 0;
		int leftSum, rightSum;
		for(int i = 0; i < inputs.length; i += 1)
			totalSum += inputs[i];
		leftSum = 0;
		rightSum = totalSum;
		for(int j = 0; j < inputs.length; j += 1){
			rightSum -= inputs[j];
			if (leftSum == rightSum)
				return true;
			leftSum += inputs[j];
		}
		return false;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i =0; i < t; i += 1){
			int n = in.nextInt();
			int[] inputArray = new int[n];
			for (int j = 0; j < n;j += 1)
				inputArray[j] = in.nextInt();
			if (equilibrium(inputArray))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
}