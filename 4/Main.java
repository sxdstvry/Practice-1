import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Введіть кількість школярів");
	    int N = scan.nextInt();
	    System.out.println("Введіть кількість яблук");
	    int K = scan.nextInt();
	    System.out.println("Кількість яблук " + K/N);
		System.out.println("Яблука в кошику " + K%N);
	}
}
