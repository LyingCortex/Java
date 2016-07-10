import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();
		//System.out.println("jfiejfiejfijeif" + N);
		Person[] person = new Person[N];
		int index = 0;
		int N_backup = N;
		while(N > 0){
			N--;
			
			String input_str = input.nextLine();
			//input.nextLine();

			String[] input_list = input_str.split(" ");
			
			if (input_list.length == 3){
				
				int[] student_score = new int[3];
				for(int i=0; i<3; i++){
					student_score[i] = Integer.parseInt(input_list[i]);
				}
				Student stu = new Student(student_score);
				person[index] = stu;
				
			}else if(input_list.length == 4){
				
				int[] teacher_score = new int[4];
				for(int i=0; i<4; i++){
					teacher_score[i] = Integer.parseInt(input_list[i]);
				}
				Teacher teacher = new Teacher(teacher_score);
				person[index] = teacher;
				
				
			}
			index++;
		}
		
		for(int i=0; i < N_backup; i++){
			
			person[i].print_line();
		}
		
		
		
	}
	
}