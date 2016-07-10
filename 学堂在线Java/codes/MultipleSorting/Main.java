import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();
		
		int N_backup = N;
		String[] input_str_list = new String[N];
		int kk = 0;
		while(N > 0){
			N--;
			
			String input_str = input.nextLine();
			input_str_list[kk] = input_str;
			kk++;
			
		}
		for(int i = 0; i<N_backup; i++){
			System.out.println(input_str_list[i]);
		}
		
		//System.out.println(N);
	}
		
		
	
	
}



class GT <Type>

