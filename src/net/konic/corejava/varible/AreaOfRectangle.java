package net.konic.corejava.varible;

public class AreaOfRectangle {
	int length;
	int width;

	void setDimensions(int l, int w) {
		length = l;
		width = w;
	}

	int getArea() {
		return length * width;
	}

	public static void main(String[] args) {

		AreaOfRectangle ra = new AreaOfRectangle();

		ra.setDimensions(10, 5);

		System.out.println("Area of Rectangle: " + ra.getArea());
	}
}
