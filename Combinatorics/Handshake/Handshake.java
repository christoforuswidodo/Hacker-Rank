import java.util.*;

public class Handshake{
	static int numHandshake(int n){
		return n * (n-1) / 2;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i += 1){
			int n = in.nextInt();
			System.out.println(numHandshake(n));
		}
	}
}