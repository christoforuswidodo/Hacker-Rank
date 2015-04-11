import java.util.*;
import java.io.*;

public class LonelyInteger{
	static int findLonelyInteger(int[] arr){
		int answer = 0;
		for(int i = 0; i < arr.length; i += 1){
			answer ^= arr[i];
		}
		return answer;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int answer;
		int arraySize = Integer.parseInt(in.nextLine());
		int[] pairedInteger = new int[arraySize];
		String arrayInputs = in.nextLine();
		String[] tokenizeLine = arrayInputs.split(" ");
		for(int i = 0; i < pairedInteger.length; i += 1){
			pairedInteger[i] = Integer.parseInt(tokenizeLine[i]);
		}
		answer = findLonelyInteger(pairedInteger);
		System.out.println(answer);
	}
}