import java.util.*;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i += 1) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] time = new int[n];
			for (int j = 0;j < n; j += 1)
				time[j] = in.nextInt();
			if (isCancelled(time,k))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static int numOnTime(int[] times) {
		int count = 0;
		for (int i = 0; i < times.length; i += 1){
			if (times[i] <= 0)
				count += 1;
		}
		return count;
	}

	public static boolean isCancelled(int[] times, int k) {
		return (numOnTime(times) < k);
	}
}