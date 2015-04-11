import java.util.*;

public class Pairs {

	public static int numPairs(int[] inputs, int diff) {
		HashMap<Integer, Integer> secondTerm = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < inputs.length; i += 1) {
			if (secondTerm.get(inputs[i]) != null) {
				count += secondTerm.get(inputs[i]);
			}
			if (secondTerm.get(inputs[i] + diff) == null) {
				secondTerm.put(inputs[i] + diff, 1);
			} else {
				secondTerm.put(inputs[i] + diff, secondTerm.get(inputs[i] + diff) + 1);
			}
			if (secondTerm.get(inputs[i] - diff) == null) {
				secondTerm.put(inputs[i] - diff, 1);
			} else {
				secondTerm.put(inputs[i] - diff, secondTerm.get(inputs[i] - diff) + 1);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] inputs = new int[n];
		for (int i = 0; i < n; i += 1) {
			inputs[i] = in.nextInt();
		}
		System.out.println(numPairs(inputs, k));

	}
}