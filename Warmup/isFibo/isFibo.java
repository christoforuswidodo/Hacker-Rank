import java.util.*;

public class isFibo{
	static boolean isFibo(long n){
		long fib0 = 0;
		long fib1 = 1;
		if (n == fib0 || n == fib1)
			return true;
		long fibRet = fib1;
		while (fibRet < n){
			fibRet = fib0 + fib1;
			fib0 = fib1;
			fib1 = fibRet;
		}
		if (fibRet == n)
			return true;
		return false;

	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int numEx = in.nextInt();
		for(int i = 0; i < numEx; i += 1){
			long number = in.nextLong();
			if (isFibo(number))
				System.out.println("IsFibo");
			else
				System.out.println("IsNotFibo");
		}
	}
}