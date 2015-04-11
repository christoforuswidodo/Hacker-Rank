import java.util.*;

public class ANDProduct{
	static boolean powerOfTwoInside(long a, long b){
		long multiplier  = 1;
		while (multiplier <= b){
			if (multiplier > a && multiplier <= b)
				return true;
			multiplier = multiplier << 1;
		}
		return false;
	}

	static long andProduct(long a, long b){
		if (powerOfTwoInside(a,b))
			return 0;
		else
			return nearBinaryStreak(a,b);

	}

	static long nearBinaryStreak(long a, long b){
		int n = 0;
		long finalOnes = a ^ b;
		while (finalOnes != 0){
			finalOnes = finalOnes >>> 1;
			n += 1;
		}
		return ((a >>> n) << n);

	}

	static long andProductNaive(long a, long b){
		if (b == a)
			return a;
		else
			return b & andProductNaive(a, b-1);
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i += 1){
			long a = in.nextLong();
			long b = in.nextLong();
			System.out.println(andProduct(a,b));
		}
	}
}