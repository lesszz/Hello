import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		int MINOR = 18;
		
		System.out.print("Please input your age");
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		
		if( age >= MINOR )
			System.out.println("You are Big jiejie");
		else
		    System.out.println("You are Little jiejie");
	}
}