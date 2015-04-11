import java.util.*;

public class CavityMap{

	static void printCavity(String[] cavMaps){
		for (int i = 0; i < cavMaps.length; i += 1){
			for(int j = 0; j < cavMaps[i].length(); j += 1){
				if (i == 0 || i == cavMaps.length-1 || j == 0 || j == cavMaps[i].length() - 1)
					System.out.print(cavMaps[i].charAt(j));
				else{
					char cavCandidate = cavMaps[i].charAt(j);
					if (cavCandidate > cavMaps[i].charAt(j-1) && cavCandidate > cavMaps[i].charAt(j+1) &&
						cavCandidate > cavMaps[i-1].charAt(j) && cavCandidate > cavMaps[i+1].charAt(j))
						System.out.print("X");
					else
						System.out.print(cavMaps[i].charAt(j));
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String[] cavMaps = new String[n];
		for(int i = 0; i < n; i += 1)
			cavMaps[i] = in.nextLine();
		printCavity(cavMaps);
	}
}