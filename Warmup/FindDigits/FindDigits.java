import java.util.*;

public class FindDigits{
	static int dividerDigits(long n){
		long original = n;
		int count = 0;
		while (n != 0){
			long quotient = n % 10;
			n = n / 10;
			if (quotient == 0)
				continue;
			if (original % quotient == 0)
				count += 1;
		}
		return count;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i += 1){
			long n = in.nextLong();
			System.out.println(dividerDigits(n));
		}
	}
}