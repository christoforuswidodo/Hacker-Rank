import java.util.*;

public class SongOfPi {

	static final String pi = "31415926535897932384626433833";

	static boolean isPiSong(String song) {
		String[] words = song.split(" ");
		for (int i = 0; i < words.length; i += 1) {
			String elem = pi.substring(i,i+1);
			if (words[i].length() != Integer.parseInt(elem)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		for (int i = 0; i < t; i += 1) {
			String song = in.nextLine();
			if (isPiSong(song))
				System.out.println("It's a pi song.");
			else
				System.out.println("It's not a pi song.");
		}

	}
}