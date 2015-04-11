import java.util.*;

public class TimeWord {

	static HashMap<Integer, String> describeHour = new HashMap<Integer,String>();
	static HashMap<Integer, String> describeMinute = new HashMap<Integer,String>();

	public static void describeTime (int hour, int minute) {
		if (minute > 30)
			hour += 1;
		if (minute == 0)
			System.out.println(describeHour.get(hour) + " " + describeMinute.get(minute));
		else
			System.out.println(describeMinute.get(minute) + " " + describeHour.get(hour));
	}

	static void buildDescHour() {
		describeHour.put(1, "one");
		describeHour.put(2, "two");
		describeHour.put(3, "three");
		describeHour.put(4, "four");
		describeHour.put(5, "five");
		describeHour.put(6, "six");
		describeHour.put(7, "seven");
		describeHour.put(8, "eight");
		describeHour.put(9, "nine");
		describeHour.put(10, "ten");
		describeHour.put(11, "eleven");
		describeHour.put(12, "twelve");
	}

	static void buildDescMin() {
		describeMinute.put(0, "o' clock");
		describeMinute.put(1, "one minute past");
		describeMinute.put(10, "ten minutes past");
		describeMinute.put(15, "quarter past");
		describeMinute.put(30, "half past");
		describeMinute.put(40, "twenty minutes to");
		describeMinute.put(45, "quarter to");
		describeMinute.put(47, "thirteen minutes to");
		describeMinute.put(28, "twenty eight minutes past");
	}

	public static void main(String[] args) {
		buildDescMin();
		buildDescHour();
		Scanner in = new Scanner(System.in);
		int hour = in.nextInt();
		int minute = in.nextInt();
		describeTime(hour, minute);
	}
}