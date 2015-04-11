import java.util.*;

public class CutTheSticks{

	static int cutSticksWithMin(int[] inputs){
		int minimum = findMin(inputs);
		int countCut = 0;
		for(int i = 0; i < inputs.length; i += 1){
			if (inputs[i] > 0){
				countCut += 1;
				inputs[i] -= minimum;
			}
		}
		return countCut;
	}

	static int findMin(int[] inputs){
		int min = 1001;
		for(int i = 0; i < inputs.length; i += 1){
			if(inputs[i] > 0){
				if (min > inputs[i])
					min = inputs[i];
			}
		}
		return min;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] initSticks = new int[n];
		for (int i = 0; i < n; i += 1)
			initSticks[i] = in.nextInt();
		int cuttedSticks = cutSticksWithMin(initSticks);
		while (cuttedSticks != 0){
			System.out.println(cuttedSticks);
			cuttedSticks = cutSticksWithMin(initSticks);
		}

	}
}