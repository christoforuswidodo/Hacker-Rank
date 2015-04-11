import java.util.*;

public class ACMICPC {

	static TreeMap<Integer, Integer> pairs = new TreeMap<Integer, Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numPerson = in.nextInt();
		int numTopics = in.nextInt();
		in.nextLine();
		String[] persTopics = new String[numPerson];
		for (int i = 0; i < numPerson; i += 1) {
			persTopics[i] = in.nextLine();
		}
		int maxKey = maxTopic(persTopics);
		System.out.println(maxKey);
		System.out.println(pairs.get(maxKey));
		//System.out.println(bitNum(addTopic("10101", "01010")));
	}

	public static int bitNum(char[] bits) {
		int sum = 0;
		for (int i = 0; i < bits.length; i += 1) {
			if (bits[i] == '1')
				sum += 1;
		}
		return sum;
	}

	static int maxTopic(String[] persTopics) {
		for (int i = 0; i < persTopics.length; i += 1) {
			for (int j = i; j < persTopics.length; j += 1) {
				if (j != i) {
					int key = bitNum(addTopic(persTopics[i], persTopics[j]));
					if (pairs.get(key) == null)
						pairs.put(key, 1);
					else
						pairs.put(key, pairs.get(key) + 1);
				}
			}
		}
		return pairs.lastKey();
	}

	static char[] addTopic(String bitFirst, String bitSecond) {
		char[] resultBit = new char[bitFirst.length()];
		for (int i = 0; i < bitFirst.length(); i += 1) {
			if (bitFirst.charAt(i) == '0' && bitSecond.charAt(i) == '0')
				resultBit[i] = '0';
			else
				resultBit[i] = '1';
		}
		return resultBit;
	}
}