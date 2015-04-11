import java.util.*;

public class SherlockPermutes{

	static int combinatorics(int n, int k){
		return (int) (multiplyCount(n, k) / multiplyUntil(k, 1));
	}

	static long multiplyUntil(int n, int m){
		if (n == m)
			return 1;
		else
			return (n * multiplyUntil(n-1, m)) % 1000000007;
	}

	static long multiplyCount(int n, int count){
		if (count == 0)
			return 1;
		else
			return (n * multiplyCount(n-1 , count - 1)) % 1000000007;
	}

	static long sherlockPermutes(int n, int m){
		if (m == 1)
			return 1;
		return combinatorics(n+m-1, m-1);
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i += 1){
			int n = in.nextInt();
			int m = in.nextInt();
			System.out.println(sherlockPermutes(n, m));
		}
	}
}