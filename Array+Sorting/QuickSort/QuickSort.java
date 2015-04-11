import java.util.*;

public class QuickSort{
	static void partition(int[] ar){
		if (ar.length <= 1)
			return;
		int p = ar[0];
		int countLeft = 0;
		int countRight = 0;
		for (int i = 1; i < ar.length; i += 1){
			if (ar[i] <= p)
				countLeft += 1;
			else
				countRight += 1;
		}
		int[] leftAr = new int[countLeft];
		int[] rightAr = new int[countRight];
		countLeft = 0;
		countRight = 0;
		for (int i = 1; i < ar.length; i += 1){
			if (ar[i] <= p){
				leftAr[countLeft] = ar[i];
				countLeft += 1;
			}
			else{
				rightAr[countRight] = ar[i];
				countRight += 1;
			}
		}
		// recursive call
		partition(leftAr);
		partition(rightAr);
		// put it back in
		int original = 0;
		for (int left = 0; left < leftAr.length; left += 1){
			ar[original] = leftAr[left];
			original += 1;
		}
		ar[original] = p;
		original += 1;
		for (int right = 0; right < rightAr.length; right += 1){
			ar[original] = rightAr[right];
			original += 1;
		}
		printArray(ar);
	}


	static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
           System.out.println("");
    } 
	
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
}