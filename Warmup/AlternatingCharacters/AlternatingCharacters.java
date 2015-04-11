import java.util.*;

public class AlternatingCharacters{
	static int numDeletions(String toAlternate){
		char comparator = toAlternate.charAt(0);
		int deleted = 0;
		for (int i = 1; i < toAlternate.length(); i += 1){
			if (comparator == toAlternate.charAt(i))
				deleted += 1;
			else
				comparator = toAlternate.charAt(i);
		}
		return deleted;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int numEx = Integer.parseInt(in.nextLine());
		for(int i = 0; i < numEx; i += 1){
			String toAlternate = in.nextLine();
			System.out.println(numDeletions(toAlternate));
		}
	}
}