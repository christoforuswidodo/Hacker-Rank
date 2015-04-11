import java.util.*;

public class UtopianTree{
	static int utopianHeight(int initial, int time){
		for(int i = 1; i <= time; i+= 1){
			if (i % 2 == 1)
				initial *= 2;
			else
				initial += 1;
		}
		return initial;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int initialHeight = 1;
		int numEx = in.nextInt();
		for(int i = 0; i < numEx; i += 1){
			int timeInput = in.nextInt();
			System.out.println(utopianHeight(initialHeight, timeInput));
		}
	}
}