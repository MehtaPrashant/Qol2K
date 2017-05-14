package Array;

public class SieveOfEratoSthenes {
	public static void getAllPrimes(int m) {
		boolean[] arr = new boolean[m+1];
		for(int i = 2; i <=m; i++) {
			int mul = 2;
			while(i*mul <= m) {
				if(arr[i*mul] == false)arr[i*mul] = true;
				mul++;
			}
		}
		for(int i = 2; i <= m; i++)
			if(arr[i] == false)System.out.print(i + " ");
	}
	public static void main(String[] args) {
		int m = 400;
		getAllPrimes(m);
	}
}
