
import java.util.Scanner;
import java.util.Arrays;


public class Main{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();  // Input integer		
		
		String[] string_to_sort = new String[N];
		
        int i ;
		
		
		for (i=0; i<N; i++){
			string_to_sort[i] = sc.next();
			
		}
		
		Arrays.sort(string_to_sort);
		for(String str : string_to_sort){
			System.out.println(str);
		}
		
	}
}
