public class Rectangle {
	private double length;
	private double breadth;
	public double getLength() {
		return length;
	}
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public double area(){
		double area= length*breadth;
		return area;
	}
	public double perimeter(){
		double perimeter =2*(length+breadth);
		return perimeter;
	}
	public double lengthOfDiagonal(){
		double squareOfLength= Math.pow(length,2);
		double squareOfBreadth= Math.pow(breadth, 2);
		double addSquaresOfLb=squareOfLength+squareOfBreadth;
		double diagonalLength=Math.sqrt(addSquaresOfLb);
		return diagonalLength;
	}
	public static boolean areaCompare(Rectangle rectangle, Rectangle rectangle1) {
		if(rectangle.area()==rectangle1.area())
			return true;
		else
			return false;
	}
}