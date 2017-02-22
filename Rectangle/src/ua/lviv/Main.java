package ua.lviv;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		rectangle1.perimeter();
		rectangle1.area();
		System.out.println();
		Rectangle rectangle2 = new Rectangle(4, 3);
		rectangle2.perimeter();
		rectangle2.area();

	}

}
