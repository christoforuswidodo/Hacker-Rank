import java.util.*;

public class MakeAnagram {

	static HashMap<Integer, Integer> firstMap = new HashMap<Integer, Integer>();
	static HashMap<Integer, Integer> secondMap = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first = in.nextLine();
		String second = in.nextLine();
		initialize();
		System.out.println(deleteToAnagram(first.toUpperCase(), second.toUpperCase()));
	}

	public static void initialize() {
		for (int i = 65; i <= 90; i += 1) {
			firstMap.put(i, 0);
			secondMap.put(i, 0);
		}
	}

	public static int deleteToAnagram(String first, String second) {
		for (int i = 0; i < first.length(); i += 1) {
			int keyFirst = first.charAt(i);
			firstMap.put(keyFirst, firstMap.get(keyFirst) + 1);
		}
		for (int j = 0; j < second.length(); j += 1) {
			int keySecond = second.charAt(j);
			secondMap.put(keySecond, secondMap.get(keySecond) + 1);
		}
		int delete = 0;
		for (Map.Entry<Integer, Integer> ent : firstMap.entrySet()) {
			delete += Math.abs(ent.getValue() - secondMap.get(ent.getKey()));
		}
		return delete;
	}
}