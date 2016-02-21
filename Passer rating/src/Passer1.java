import java.util.Scanner;
public class Passer1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double comp;
		System.out.print("Number of completions: ");
		comp = input.nextDouble();
		double attempts;
		System.out.print("Number of attempts: ");
		attempts = input.nextDouble();
		double yards;
		System.out.print("Number of yards: ");
		yards = input.nextDouble();
		double td;
		System.out.print("Number of touchdowns: ");
		td = input.nextDouble();
		double inter;
		System.out.print("Number of interceptions: ");
		inter = input.nextDouble();
		double formula1 = (((comp / attempts) - 0.3) * 5);
		double formula2 = (((yards/attempts) - 3) * .25);
		double formula3 = ((td/attempts) * 20);
		double formula4 = 2.375 - ((inter/attempts) * 25);
		double rating = ((formula1 + formula2 + formula3 + formula4) / 6) * 100;
		System.out.print("The passer's rating is: " + rating);
	}

}
