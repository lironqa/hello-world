import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String username;
		Scanner reader = new Scanner (System.in);
		System.out.println("Hello world");
		System.out.println("What is your name?");
		username=reader.next();
		System.out.println("Hello, "+username);
		reader.close();
	}

}
