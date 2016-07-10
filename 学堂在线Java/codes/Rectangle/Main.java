import java.util.Scanner;

public class Main{
    static int height;
	static int width;
	static int getArea(){
		return height * width;
	}
	static int getPerimeter(){
		return 2*(height + width);
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		height = input.nextInt();
		width = input.nextInt();
		System.out.print(getArea());
		System.out.print(" ");
		System.out.print(getPerimeter());
	}
}