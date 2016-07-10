import java.util.Scanner;

public  class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		int gcd = greatest_common_divisor(m, n);
		int lcm = m*n/gcd;
		System.out.println(gcd+" " +lcm);
		
		
		
	}
	public static int greatest_common_divisor(int m, int n){
		if(m<n){
			int t = m;
			m = n;
			n = t;
		}
		while(true){
			if(m%n == 0){
				
				break;
			}else{
			    int temp = m%n;
				m = n;
				n = temp;
			}
		}
		return n;
	}
	
}