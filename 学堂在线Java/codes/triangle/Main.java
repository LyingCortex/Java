import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double x, y,z;
		x = input.nextDouble();
		y = input.nextDouble();
		z = input.nextDouble();
		Triangle t = new Triangle(x, y, z);
	
		System.out.println(t.getArea());
	}
}