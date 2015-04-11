import java.util.*;

public class KaprekarNumber {

	static ArrayList<Long> kaprekarNums = new ArrayList<Long>();

	public static void populateKaprekar(long p, long q) {
		for (long start = p; start <= q; start += 1) {
			if (isKaprekar(start))
				kaprekarNums.add(start);
		}
	}

	public static boolean isKaprekar(long x) {
		long tenPower = (long) Math.pow(10,numDigits(x));
		long squared = x*x;
		long right = squared % tenPower;
		long left = (long) squared / tenPower;
		if (right+left == x)
			return true;
		return false;
	}

	public static long numDigits(long x) {
		long count = 0;
		while(x > 0) {
			count += 1;
			x = (long) x / 10;
		}
		return count;
	}

	public static void printArrayList(ArrayList<Long> arr) {
		for (int i = 0; i < arr.size(); i += 1) {
			if (i == arr.size() - 1)
				System.out.println(arr.get(i));
			else
				System.out.print(arr.get(i) + " ");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long p = in.nextLong();
		long q = in.nextLong();
		populateKaprekar(p,q);
		if (kaprekarNums.size() == 0)
			System.out.println("INVALID RANGE");
		else
			printArrayList(kaprekarNums);
	}
}