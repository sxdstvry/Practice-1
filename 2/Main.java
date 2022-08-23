import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int number = scan.nextInt();
	    int plus = number + 1;
	    int minus = number - 1;
	    if(number > 10000)
	    {
	        System.out.println("number is too big");
	        System.exit(1);
	    }
		System.out.println("The next number for the number "+number+" is "+ plus);
		System.out.println("The previous number for the number "+number+" is "+ minus);
	}
}
