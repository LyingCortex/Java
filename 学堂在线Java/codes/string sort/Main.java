//Scanner sc  = new Scanner(System.in);
//String s = sc.next();
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		boolean integer_label = true;
		int N=3;
		while(integer_label){
			System.out.println("-----------------------");
		    System.out.println("Input the number of strings you want to be sorted( an Integer): ");
		    N = sc.nextInt();  // Input integer
			if (N > 0){
				integer_label = false;
				System.out.println("The number you input is :" + N);
			}else{
				System.out.println("Wrong. Please input the correct number.");
			}
		}
		
		
		
		
		String[] string_to_sort = new String[N];
		
        
		int i ;
		
		for (i=0; i<N; i++){
			System.out.println("-----------------------");
			System.out.println("String "+ (i+1) + ": ");
			string_to_sort[i] = sc.next();
			System.out.println("You input \"" + string_to_sort[i] + "\"");
		}
		
	}
}
