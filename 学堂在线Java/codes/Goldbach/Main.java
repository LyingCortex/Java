import java.util.Scanner;

public  class Main{
	public static boolean isPrime(int n){
		// boolean label = true;
		for (int i = 2; i < Math.sqrt(n);i++){
			
			if(n%i == 0){
				return false;
			}			
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		for (int i = 2; i<m/2; i++){
			if(isPrime(i) && isPrime(m-i)){
				System.out.println(m+"="+i+"+"+(m-i));
			}
		}
	}
		
}