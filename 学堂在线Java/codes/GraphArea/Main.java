import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();
		
		Graph[] graph_list = new Graph[N];
		int N_backup = N;
		int index = 0;
		while(N > 0) {
			N--;
			int[] triangle_edges = new int[3];
			int[] rectangle_edges = new int[2];
			
			String edge_str = input.nextLine();
			String[] edge_str_list = edge_str.split(" ");
			
			if(edge_str_list.length == 2){
				for(int i=0; i<2; i++){
					rectangle_edges[i] = Integer.parseInt(edge_str_list[i]);
				}
				Rectangle rectangle = new Rectangle(rectangle_edges[0], rectangle_edges[1]);
				graph_list[index] = rectangle;
				
			}else if(edge_str_list.length == 3){
				for(int i=0; i<3; i++){
					triangle_edges[i] = Integer.parseInt(edge_str_list[i]);
				}
				Triangle triangle = new Triangle(triangle_edges[0], triangle_edges[1], triangle_edges[2]);
				graph_list[index] = triangle;
			}
			index ++;
			
		}
		for (int i=0; i< N_backup; i++){
			graph_list[i].getArea();
			graph_list[i].showArea();
		}
	
		
		
	}
	
}

abstract class Graph{
	int area;
	
	abstract  void getArea();
	public void showArea(){
		System.out.println(area);
	}
	public Graph(){
		this(0);
	}
	public Graph(int graph_area){
		area = graph_area;
	}
}

class Triangle extends Graph{
	int x, y, z;
	
	void getArea(){
		// double p = (this.x + this.y+ this.z)/2;
		// return Math.sqrt(p*(p-this.x)*(p-this.y)*(p-this.z));
		double p = (x+y+z)/2;
		area = (int)Math.sqrt(p*(p-x)*(p-y)*(p-z));
	}
	/* public Triangle(){
		x = 0;
		y = 0;
		z = 0;
	} */
	public Triangle(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
}

class Rectangle extends Graph{
	int x, y;
	
	void getArea(){
		area =x * y;
	}
	
	public Rectangle(int x, int y){
		this.x = x;
		this.y = y;
		
	}
}