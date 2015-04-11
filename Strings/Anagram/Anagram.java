import java.util.*;

public class Anagram {

	static HashMap<Integer, Integer> s1 = new HashMap<Integer, Integer

	static int anagraming(String subject) {
		int totalLength = subject.length();
		int firstLength = (int) totalLength / 2;
		int secondLength = totalLength - firstLength;
		if (firstLength != secondLength) {
			return -1;
		}
		for (int i = 0; i < firstLength; i += 1) {
			if (subject.charAt(i) != subject.charAt(totalLength-1-i)){
				count += 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		for (int i = 0; i < t; i += 1) {
			String toBeAnagramed = in.nextLine();
			System.out.println(anagraming(toBeAnagramed));
		}
	}
}