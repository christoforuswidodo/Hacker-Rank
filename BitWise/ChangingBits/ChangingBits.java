import java.util.*;

public class ChangingBits {

	static ArrayList<Boolean> cVal = new ArrayList<Boolean>();
	static boolean[] c;
	static boolean cache = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		in.nextLine();
		c = new boolean[n + 1];
		String bitsA = in.nextLine();
		String bitsB = in.nextLine();
		boolean[] opBitsA = initializeBits(bitsA, n);
		boolean[] opBitsB = initializeBits(bitsB, n);
		for (int j = 0; j < q; j += 1) {
			String[] tokens = in.nextLine().split(" ");
			if (tokens[0].equals("set_a")) {
				setBit(opBitsA, Integer.parseInt(tokens[1]), convertBool(tokens[2]));
			}
			else if (tokens[0].equals("set_b")) {
				setBit(opBitsB, Integer.parseInt(tokens[1]), convertBool(tokens[2]));
			}
			else
				getC(Integer.parseInt(tokens[1]), opBitsA, opBitsB);
		}
		printArray(cVal);

	}

	static void printArray(boolean[] arr) {
		for (int i = 0; i < arr.length; i += 1) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	static void printArray(ArrayList<Boolean> vals) {
		for (int i =0; i < vals.size(); i += 1)
			if (vals.get(i))
				System.out.print("1");
			else
				System.out.print("0");
		System.out.println("");
	}

	static boolean convertBool(String num) {
		if (num.equals("1"))
			return true;
		return false;
	}

	static boolean[] initializeBits(String bits, int size) {
		boolean[] retBits = new boolean[size];
		for (int i = 0; i < bits.length(); i += 1)
			if (bits.charAt(i) == '1')
				retBits[i] = true;
			else
				retBits[i] = false;
		return retBits;
	}

	public static void setBit(boolean[] bits, int index, boolean change) {
		bits[bits.length - 1 - index] = change;
		cache = false;
	}

	public static void getC(int index, boolean[] as, boolean[] bs) {
		if (!cache)
			calcC(as, bs);
		cVal.add(c[c.length - 1 - index]);
	}

	public static void calcC(boolean[] as, boolean[] bs) {
		boolean carryIn = false;
		for (int i = 0; i < as.length; i += 1) {
			boolean val = addSimp(carryIn, addSimp(as[as.length - 1 - i], bs[as.length - 1 - i]));
			carryIn = carry(as[as.length - 1 - i],bs[as.length - 1 - i], carryIn);
			c[c.length-1-i] = val; 
		}
		c[0] = carryIn;
		cache = true;
	}

	public static boolean addSimp(boolean a, boolean b) {
		return ((!a && b) || (a && !b));
	}

	public static boolean carry(boolean a, boolean b, boolean carry) {
		return (a && b) || (b && carry) || (a && carry) || (a && b && carry);
	}

}