public class maxXOR{
	static int maxXOR(int l, int r){
		int maxResult = 0;
		for (int i = l; i <= r; i += 1){
			for (int j = l; j <= r; j += 1){
				int temp = i ^ j;
				if (temp > maxResult)
					maxResult = temp;
			}
		}
		return maxResult;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res); 
    }
}