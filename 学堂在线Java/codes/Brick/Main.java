import java.util.Scanner;
public class Main{
    
    	
	public static long Arrange(long n){
		if (n== 1){
			return 1;
		}
		else if(n == 2){
			return 2;
		}
		else{
			return Arrange(n-1) + Arrange(n-2);
		}
	}

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();
        System.out.println(Arrange(N));
    }
    
}


