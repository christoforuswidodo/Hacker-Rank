import java.util.*;

public class SherlockSquares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i += 1) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(numSquare(a,b));
		}
	}

	public static int numSquare(int a, int b) {
		int count = 0;
		int firstSquare = firstSquare(a,b);
		if (firstSquare != 0) {
			int rooted = (int) Math.sqrt(firstSquare);
			while (rooted*rooted <= b) {
				count += 1;
				rooted += 1;
			}
		}
		return count;
	}

	public static boolean isSquare(int num) {
		if (Math.sqrt(num) % 1 != 0)
			return false;
		return true;
	}

	public static int firstSquare(int a, int b) {
		for (int j = a; j <= b; j += 1)
			if (isSquare(j))
				return j;
		return 0;
	}
}