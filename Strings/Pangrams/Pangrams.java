import java.util.*;

public class Pangrams {

	static HashMap<Integer, Integer> numAlp = new HashMap<Integer, Integer>();

	public static void populateNumAlp() {
		for (int i = 65; i <= 90; i += 1) {
			numAlp.put(i, 0);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		String[] collSentence = sentence.split(" ");
		populateNumAlp();
		calcAlphabet(collSentence);
		if (isPangram())
			System.out.println("pangram");
		else
			System.out.println("not pangram");

	}

	static void calcAlphabet(String[] collSentence) {
		for (int i = 0; i < collSentence.length; i += 1) {
			String upper = collSentence[i].toUpperCase();
			for (int j = 0; j < upper.length(); j += 1) {
				int ord = upper.charAt(j);
				numAlp.put(ord, numAlp.get(ord) + 1);
			}
		}
	}

	public static boolean isPangram() {
		for (Map.Entry<Integer, Integer> entry : numAlp.entrySet()) {
			if (entry.getValue() == 0)
				return false;
		}
		return true;
	}
}