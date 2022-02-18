package be.intecbrussels;

public class Circle {
	
	private int x;
	private int y;
	private int radius;
	
	
	public final static int ANGLES;
	private static int count;
	
	static {
		ANGLES = 4;
	}
	
	{
		System.out.println("We are creating an object");
		count++;
	}
	
	public Circle (){
		this(0);
		
	}
	
	public Circle(int radius) {
		this(radius,0,radius);
		
		
	}
	
	
	public Circle(int radius, int x, int y ) {
		this.radius = radius;
		this.x = x;
		this.y = y;
		
	}
	public Circle(Circle c) {
		this(c.getX(), c.getY(), c.getRadius());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public static int getCount() {
		return count;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public double getArea() {
		return (this.radius * this.radius * 22)/7;
	}
	
	public double getPerimeter() {
		return (this.radius * 22/7) * 2;
	}
	
	
	

}
