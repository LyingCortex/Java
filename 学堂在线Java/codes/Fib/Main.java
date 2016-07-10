import java.util.Scanner;  // system in

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // input integer
		
		long[] f = {1, 1, 0};
		
		if (N == 0 || N == 1){
			System.out.println(1);
		}else{
			while(N>1){
				f[2] = f[0] + f[1];
				f[0] = f[1];
				f[1] = f[2];
				N = N-1;
			}
			System.out.println(f[1]);
		}	
		
		
	}
}