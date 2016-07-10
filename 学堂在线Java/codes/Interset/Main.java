import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int[] N1_array = new int[N1];
		
		// input  the first array
		for (int i = 0; i<N1; i++){
			N1_array[i] = sc.nextInt();
		}
		
		
		int N2 = sc.nextInt();
		int[] N2_array = new int[N2];
		// input the second array
		for(int i=0; i < N2; i++){
			N2_array[i] = sc.nextInt();
		}
		
		//boolean label = true;
		int num = 0;
		for (int n1 : N1_array){
			for(int n2 : N2_array){
				if (n1 ==n2){
					num++;
					
				}
			}
		}
		if (num == 0){
			System.out.println("None");
		}else{
			System.out.println(num);
		}
		
		
		
	}
}