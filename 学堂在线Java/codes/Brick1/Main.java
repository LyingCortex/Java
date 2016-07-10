import java.util.Scanner;
public class Main{
    
    	
	public static long Arrange(long n){
		long[] s = {1,2,0};
		
		if (n== 1){
			s[0] = 1;
			return s[0];
		}
		else if(n == 2){
			s[1] = 2;
			return s[1];
		}
		else{
			for (long i = 3; i<=n; i++){
				s[2] = s[0] + s[1];
				s[0] = s[1];
				s[1]= s[2];
			}
			return s[2];
		}
		
	}

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();
        System.out.println(Arrange(N));
    }
    
}


