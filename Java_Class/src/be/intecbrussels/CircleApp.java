package be.intecbrussels;

public class CircleApp {

	public static void main(String[] args) {
		
		System.out.println("This program is for circle");
		Circle circle = new Circle(15);
		
		circle.setX(10);
		circle.setY(12);
		
		System.out.println("Circle radius is: " + circle.getRadius());
		System.out.printf("Position is: " + circle.getX(), circle.getY());
		System.out.println();
		
		
		System.out.println("The area is: " + circle.getArea());
		System.out.println("The perimeter is: " + circle.getPerimeter());
		
		System.out.println("Numbers of circle created: " + Circle.getCount());
		
		
		System.out.println("2nd Circle");
		Circle circle2 = new Circle(8);
		
		circle2.setX(5);
		circle2.setY(6);
		
		System.out.println("Circle radius is: " + circle2.getRadius());
		System.out.printf("Position is: " + circle2.getX(), circle.getY());
		System.out.println();
		
		
		System.out.println("The area is: " + circle2.getArea());
		System.out.println("The perimeter is: " + circle2.getPerimeter());
		
		System.out.println("Numbers of circle created: " + Circle.getCount());

		
		System.out.println("3rd Circle");
		Circle circle3 = new Circle(45);
		
		circle3.setX(23);
		circle3.setY(25);
		
		System.out.println("Circle radius is: " + circle3.getRadius());
		System.out.printf("Position is: " + circle3.getX(), circle.getY());
		System.out.println();
		
		
		System.out.println("The area is: " + circle3.getArea());
		System.out.println("The perimeter is: " + circle3.getPerimeter());
		
		System.out.println("Numbers of circle created: " + Circle.getCount());

		
		System.out.println("4th Circle");
		Circle circle4 = new Circle(25);
		
		circle4.setX(15);
		circle.setY(10);
		
		System.out.println("Circle radius is: " + circle4.getRadius());
		System.out.printf("Position is: " + circle4.getX(), circle.getY());
		System.out.println();
		
		
		System.out.println("The area is: " + circle4.getArea());
		System.out.println("The perimeter is: " + circle4.getPerimeter());
		
		System.out.println("Numbers of circle created: " + Circle.getCount());

		
		
		


	}

}
