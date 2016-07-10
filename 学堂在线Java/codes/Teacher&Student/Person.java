public class Person{
	//
	//public String name;
	public int[] score;
	
	// public String getName(){
		// return name;
	// }
	
	public int average(){
		int sum = 0;
		for (int i:score){
			sum += i;		
		}
		return sum / score.length;
		
	}
	
	// public abstract String toString
	public void print_line(){
		
		System.out.println(this.getClass().getName() + " " + this.average());
		
	}
	public Person(int[] score){
		this.score = score;
	}	
	
}