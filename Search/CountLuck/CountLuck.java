import java.util.*;

public class CountLuck {

	public static findWayOut(char[][] maps)

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i += 1) {
			int n = in.nextInt();
			int m = in.nextInt();
			in.nextLine();
			char[][] maps = new char[n][m];
			for (int j = 0; j < n; j += 1) {
				String oneString = in.nextLine();
				for (int k = 0; k < m; k += 1) {
					char[j][k] = oneString.charAt(k);
				}
			}	
		}
	}


}