import java.util.*;

public class SmithNumbers {

	static ArrayList<Integer> pf = new ArrayList<Integer>();

	static int isSmithNumber(long n) {
		lookPrimeFactors(n);
		if (sumArrayDigits(pf) == addDigits(n))
			return 1;
		return 0;
	}

	static int sumArrayDigits(ArrayList<Integer> ints) {
		int sum = 0;
		for (int i = 0; i < ints.size(); i += 1) {
			sum += addDigits(ints.get(i));
		}
		return sum;
	}

	static boolean isPrime(long n) {
		for (int i = 2; i*i < n; i += 1) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void lookPrimeFactors(long n) {
		if (n == 0)
			return;
		for (int i = 2; i <= n; i += 1) {
			if (n % i == 0) {
				if (isPrime(i)) {
					pf.add(i);
					lookPrimeFactors((long) n / i);
					return;
				}
			}
		}
	}

	static int addDigits(long n) {
		int sum = 0;
		while(n != 0) {
			sum += n % 10;
			n = (long) n / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		System.out.println(isSmithNumber(n));
		//System.out.println(isPrime());
	}
}