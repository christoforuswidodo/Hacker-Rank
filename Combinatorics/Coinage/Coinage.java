import java.util.*;

public class Coinage{
	static int ones = 0;
	static int twos = 0;
	static int fives = 0;
	static int tens = 0;

	static boolean totalWays(int n){
		if (n == 0)
			return true;
		if (n < 0)
			return false;
		boolean retTemp = totalWays(n - 10);
		boolean retval = false;
		if (retTemp)
			tens+=1;
		retval = retval || retTemp;
		retTemp = totalWays(n - 5);
		if (retTemp)
			fives+=1;
		retval = retval || retTemp;
		retTemp = totalWays(n - 2);
		if (retTemp)
			twos+=1;
		retval = retval || retTemp;
		retTemp = totalWays(n - 1);
		if (retTemp)
			ones+=1;
		retval = retval || retTemp;
		return true;
	}

	static void reset(){
		ones = 0;
		twos = 0;
		fives = 0;
		tens = 0;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i += 1){
			int n = in.nextInt();
			totalWays(n);
			System.out.print(ones + " ");
			System.out.print(twos + " ");
			System.out.print(fives + " ");
			System.out.print(tens + " ");
			reset();
		}
	}
}