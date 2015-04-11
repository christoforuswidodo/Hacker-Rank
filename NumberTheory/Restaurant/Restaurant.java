import java.util.*;

public class Restaurant {

	static int maxBread(int length, int width) {
		int totalArea = length * width;
		int maxSquare = gcd(length, width) * gcd(length, width);
		return (int) totalArea / maxSquare;
	}

	static int gcd(int a, int b) {
		if (b > a)
			return gcd(b,a);
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i += 1) {
			int l = in.nextInt();
			int b = in.nextInt();
			System.out.println(maxBread(l,b));
		}
	}
}