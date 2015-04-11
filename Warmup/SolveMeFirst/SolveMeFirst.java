import java.util.*;
import java.io.*;

public class SolveMeFirst{
	static int solveMeFirst(int a, int b){
		return a + b;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int first;
		first = in.nextInt();
		int second;
		second = in.nextInt();
		int result;
		result = solveMeFirst(first, second);
		System.out.println(result);
	}
}