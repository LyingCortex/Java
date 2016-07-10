import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double x1, y1;
		double x2, y2;
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		MyPoint p1 = new MyPoint(x1, y1);
		MyPoint p2 = new MyPoint(x2, y2);
		double dist = p2.getD(p1);
		System.out.println(dist);
	}
}