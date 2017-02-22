package ua.lviv;
//rectangle
public class Rectangle {
	int a, b;
	public Rectangle(){
		 a = 5;
		 b = 6;
	}
	public Rectangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void perimeter(){
		int p = 2*(a + b);
		System.out.println("Perimeter = "+p);
	}
	public void area(){
		int s = a*b;
		System.out.println("Area of rectangle = "+s);
		
	}

}
