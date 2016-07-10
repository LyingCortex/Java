class Triangle{
	double x, y, z;
	
	double findmax(double a, double b, double c){
		double max = a;
		if (a<b){
			max = b;
		}
		if (max < c){
			max = c;
		}
		return max;
	}
    Triangle(double k, double m, double n){
		if(k+m>n && m+n>k && n+k>m && m>0 && n>0 && k>0){
			x = k;
			y = m;
			z = n;
		}	
		else{
			double max_e = findmax(k, m, n);
			if(max_e > 0){
				x = max_e;
				y = max_e;
				z = max_e;
			}else{
				x =0;
				y=0;
				z=0;
			}
			
		}
		//System.out.println(x+","+y+","+z);
		
	}
		
	public double getArea(){
		double p = (x+y+z)/2;
		return Math.sqrt(p*(p-x)*(p-y)*(p-z));
	}
	
}