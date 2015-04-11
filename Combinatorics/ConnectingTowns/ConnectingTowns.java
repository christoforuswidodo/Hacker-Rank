import java.util.*;

public class ConnectingTowns{

	static int totalRoutes(int[] numRoutes){
		int totalRoute = 1;
		for(int i = 0; i < numRoutes.length; i += 1)
			totalRoute = (totalRoute * numRoutes[i]) % 1234567;
		return totalRoute;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i += 1){
			int numTowns = in.nextInt();
			int[] numRoutes = new int[numTowns-1];
			for(int j = 0; j < numRoutes.length; j +=1 )
				numRoutes[j] = in.nextInt();
			System.out.println(totalRoutes(numRoutes));
		}
	}
}