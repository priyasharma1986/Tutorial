
import java.util.Scanner;
public class Priyanka {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello");
		
		System.out.println("Enter you name");
		String name = scanner.nextLine();
		
		System.out.println("Enter your city");
		String city = scanner.nextLine();
		
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		
		
		System.out.printf("My name is %s i live in %s, i am %d%n years old.",name,city,age);

	}

}