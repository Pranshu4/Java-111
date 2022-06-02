package day10;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		
		return (length*breadth);
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		return (int)(3.14*(2*radius));
	}

}
