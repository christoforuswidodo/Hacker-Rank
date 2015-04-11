import java.util.*;
import edu.princeton.cs.introcs.In;

public class MissingNumber{

	static TreeMap<Integer, Integer> original = new TreeMap<Integer, Integer>();
	static TreeMap<Integer, Integer> altered = new TreeMap<Integer, Integer>();

	public static void buildOriginal(Integer[] list) {
		for (int i = 0; i < list.length; i += 1) {
			if (original.get(list[i]) == null)
				original.put(list[i], 1);
			else
				original.put(list[i], original.get(list[i]) + 1);
		}
	}

	public static void buildAltered(Integer[] list) {
		for (Map.Entry<Integer, Integer> entry : original.entrySet()) {
			altered.put(entry.getKey(), 0);
		}
		for (int i = 0; i < list.length; i += 1) {
			altered.put(list[i], altered.get(list[i]) + 1);
		}
	}

	public static TreeSet<Integer> findMissingNum(Integer[] listA, Integer[] listB) {
		if (listB.length > listA.length) {
			return findMissingNum(listB, listA);
		}
		buildOriginal(listA);
		buildAltered(listB);
		TreeSet<Integer> missNums = new TreeSet<Integer>();
		for (Map.Entry<Integer, Integer> entry : original.entrySet()) {
			if (entry.getValue() > altered.get(entry.getKey()))
				missNums.add(entry.getKey());
		}
		return missNums;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] listA = new Integer[n];
		for (int i = 0; i < n; i += 1)
			listA[i] = in.nextInt();
		int m = in.nextInt();
		Integer[] listB = new Integer[m];
		for (int i = 0; i < m; i += 1)
			listB[i] = in.nextInt();
		TreeSet<Integer> theMissNums = findMissingNum(listA, listB);
		for (Integer missNum : theMissNums) {
			System.out.print(missNum + " ");
		}
		System.out.println("");

		// In reader = new In("test_case.txt");
		// int n = reader.readInt();
		// Integer[] listA = new Integer[n];
		// for (int i = 0; i < n; i += 1)
		// 	listA[i] = reader.readInt();
		// int m = reader.readInt();
		// Integer[] listB = new Integer[m];
		// for (int i = 0; i < m; i += 1)
		// 	listB[i] = reader.readInt();
		// TreeSet<Integer> theMissNums = findMissingNum(listA, listB);
		// for (Integer missNum : theMissNums) {
		// 	System.out.print(missNum + " ");
		// }
		// System.out.println("");
	}
}