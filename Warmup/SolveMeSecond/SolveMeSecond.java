import java.util.*;

public class SolveMeSecond{
	static int sum(int a, int b){
		return a + b;
	}
	public static void main(String[] args){
		// Scanner reader = new Scanner(System.in);
		// int numExecution = Integer.parseInt(reader.nextLine());
		// String readInput;
		// int[] answers = new int[numExecution];
		// for(int i = 0; i < numExecution; i += 1){
		// 	readInput = reader.nextLine();
		// 	String[] tokenize = readInput.split(" ");
		// 	answers[i] = sum(Integer.parseInt(tokenize[0]),Integer.parseInt(tokenize[1]));
		// }
		// for(int j = 0; j < numExecution; j += 1){
		// 	System.out.println(answers[j]);
		// }
		Scanner in = new Scanner(System.in);
        int t;
        int sum;
        int a,b;
        t = in.nextInt();
        for (int i=0;i<t;i++) {
            a = in.nextInt();
            b = in.nextInt();
            sum = sum(a, b);
            System.out.println(sum);
        }
	}

}