import java.util.Scanner;
public class Jinzita {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your line number");
        int a = scan.nextInt()+1;
        for(int i = 1; i < a; i++) {
	        for(int j = 0; j < (a - i); j++) {
		        System.out.print(" ");
	        }
	        for(int k = 0; k < 2 * i - 1; k++) {
		        System.out.print("*");
	        }
	        System.out.println("");
        }
    }
}