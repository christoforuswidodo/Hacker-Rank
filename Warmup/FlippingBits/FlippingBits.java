import java.util.*;

public class FlippingBits{
	static long flipAllBits(int a){
		int flipped  = ~a;
		long unsignedFlipped = flipped & 0xffffffffl;
		return unsignedFlipped;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int numExecution = in.nextInt();
		long[] answers = new long[numExecution];
		for(int i = 0; i < numExecution; i += 1){
			int input = in.nextInt();
			answers[i] = flipAllBits(input);
			System.out.println(answers[i]);
		}
	}
}