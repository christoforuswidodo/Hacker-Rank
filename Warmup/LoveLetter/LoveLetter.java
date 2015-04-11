import java.util.*;

public class LoveLetter{
	public static int reductCharToCompare(char a, char b){
		if (b == a)
			return 0;
		if ((int) a > (int) b)
			return reductCharToCompare(b, a);
		else
			return 1 + reductCharToCompare(a, (char) ((int) b - 1));
	}

	public static int numReduction(String palindrome){
		int count = 0;
		int midPoint = (int) ((palindrome.length() - 1)/ 2);
		int start = midPoint + 1;
		if (palindrome.length() % 2 == 1)
			midPoint = midPoint - 1;
		for(int i = start; i < palindrome.length(); i += 1){
			char compare1 = palindrome.charAt(midPoint);
			char compare2 = palindrome.charAt(i);
			count += reductCharToCompare(compare1, compare2);
			midPoint -= 1;
		}
		return count;


	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int numEx = Integer.parseInt(in.nextLine());
		for(int i = 0; i < numEx; i += 1){
			String toPalindrome = in.nextLine();
			System.out.println(numReduction(toPalindrome));
		}
	}
}