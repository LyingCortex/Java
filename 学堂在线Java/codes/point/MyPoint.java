class MyPoint{
	private double x, y;
	MyPoint(){
		x = 0;
		y = 0;
	}
	MyPoint(double x, double y){
		this.x = x;
	    this.y = y;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getD(MyPoint p){
		double dx = this.x - p.getX();
		double dy = this.y - p.getY();
		double dist = dx * dx + dy * dy;
		return Math.sqrt(dist);
	}
	
}