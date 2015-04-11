import java.util.*;

public class CircleCity{

	public static boolean isAllProtected(int squaredRadius, int numStation) {
		if (numStation >= 4*numSuburbs(squaredRadius))
			return true;
		return false;
	}
	public static int numSuburbs(int squaredRadius) {
		int initial = (int) Math.sqrt(squaredRadius);
		return numSuburbs(squaredRadius, initial, 0, 0, initial);
	}

	public static int numSuburbs(int squaredRadius, int x, int y, int endX, int endY) {
		if (x <= endX && y >= endY)
			return 0;
		int val = 0;
		if ((x*x + y*y) == squaredRadius)
			val = 1;
		if ((x*x + y*y) < squaredRadius)
			return val + numSuburbs(squaredRadius, x, y+1, endX, endY);
		else
			return val + numSuburbs(squaredRadius, x-1, y, endX, endY);

	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i += 1) {
			int d = in.nextInt();
			int k = in.nextInt();
			if (isAllProtected(d, k))
				System.out.println("possible");
			else
				System.out.println("impossible");
		}
	}
}