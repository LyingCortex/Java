enum Season{
	a,b,c,d

}
public class Main{
	public static void main(String[] args){
		for(Season c: Season.values()){
			System.out.print(c+",");
		}
			
       	System.out.print(",");
	}
}
