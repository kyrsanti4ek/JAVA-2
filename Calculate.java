import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Please enter first number: ");
		int first = in.nextInt();
		System.out.print("Please enter second number: ");
		int second = in.nextInt();
		//int first = Integer.valueOf(args[0]);
		//int second = Integer.valueOf(args[0]);
		int summ = first + second;
		int razn = first - second;
		int multiply = first * second;
		int divide = first / second;
		System.out.println("Calculate...");
		System.out.println("Summ is: " + summ);
		System.out.println("Razn is: " + razn);
		System.out.println("Multiply is: " + multiply);
		System.out.println("Divide is: " + divide);
    }
}