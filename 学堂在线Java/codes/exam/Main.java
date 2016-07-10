public class Main {

public static void main(String[] args) {

int a=1,b=2;

swap(a,b);

System.out.println("a=" + a + ",b=" + b);

MyInteger c = new MyInteger(a); MyInteger d = new MyInteger(b);

swap(c, d);

System.out.println("c=" + c + ",d=" + d);

System.out.println("c+d="+c.add(d)+",c="+c);

System.out.println("c+d="+MyInteger.add(c, d)+",c="+c);

MyInteger e=new MyInteger(3);

MyInteger f=new MyInteger(4);

MyInteger g=new MyInteger(3);

MyInteger h=e;

MyInteger i=new MyInteger(f);

System.out.println(e==g);

System.out.println(e==h);

System.out.println(f==i);

System.out.println(e.equals(g));

System.out.println(e.equals(h));

System.out.println(f.equals(i));

}

public static void swap(int a, int b) {

int temp = a; a = b; b = temp;

}

public static void swap(MyInteger a, MyInteger b) {

int temp = a.getNum(); a.setNum(b.getNum()); b.setNum(temp);

}

}

class MyInteger {

private int num;

public MyInteger(MyInteger a){

num=a.getNum();

}

public MyInteger(int num) {

this.num = num;

}

public int getNum() {

return num;

}

public void setNum(int num) {

this.num = num;

}

public String toString() {

return Integer.toString(num);

}

public boolean equals(MyInteger a){

return num==a.getNum();

}

public MyInteger add(MyInteger a){

num+=a.getNum();

return this;

}

public static MyInteger add(MyInteger a, MyInteger b){

return new MyInteger(a.getNum()+b.getNum());

}

}