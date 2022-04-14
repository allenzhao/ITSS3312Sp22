package demo;

public class Rectangular extends Shapes{
	private double length;
	private double width;
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double computeArea() {
		return this.width * this.length;
	}

}
