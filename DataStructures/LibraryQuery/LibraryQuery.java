import java.util.*;

public class LibraryQuery {

	static TreeMap<Integer, Integer> shelves; // shelf number -> amount of books

	public static int findRank(int start, int end, int rank) {
		TreeMap<Integer, Set<Integer>> reversedShelves = new TreeMap<Integer, Set<Integer>>();
		for (int i = start; i <= end; i += 1) {
			int numBooks = shelves.get(i);
			if (reversedShelves.get(numBooks) == null){
				HashSet<Integer> temp = new HashSet<Integer>();
				temp.add(i);
				reversedShelves.put(numBooks, temp);
			}
			else
				reversedShelves.get(numBooks).add(i);
		}
		for (Map.Entry<Integer, Set<Integer>> entry : reversedShelves.entrySet()) {
			for (Integer numShelf : entry.getValue()) {
				if (rank == 1)
					return numShelf;
				rank -= 1;
			}
		}
		return 0;
	}

	public static int query2(int start, int end, int rank) {
		int numShelf = findRank(start, end, rank);
		return shelves.get(numShelf);
	}

	public static void query1(int shelfNum, int newBook) {
		shelves.put(shelfNum, newBook);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i += 1) {
			int numShelves = in.nextInt();
			shelves = new TreeMap<Integer, Integer>();
			for (int j = 0; j < numShelves; j += 1)
				shelves.put(j + 1, in.nextInt());
			int queries = in.nextInt();
			for (int k = 0; k < queries; k += 1) {
				int inst = in.nextInt();
				int arg1 = in.nextInt();
				int arg2 = in.nextInt();
				if (inst == 1) {
					query1(arg1, arg2);
				}
				else {
					int arg3 = in.nextInt();
					System.out.println(query2(arg1, arg2, arg3));
				}
			}
		}
	}
}