import java.util.Scanner;
public class Euclid 
{
	public static int ngcd(int na, int nb) {
		while (nb !=0) {
		int temp = nb;
		nb =na % nb;
		na = temp;
		}
		return na;
		}

	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number to find GCD");
		int na = scanner.nextInt();
		if (na < 0) {
		System.out.println("A must be a positive integer.");
		return;
		}
		System.out.println("Please enter second number to find GCD");
		int nb = scanner.nextInt();
		if (nb < 0) {
		System.out.println("B must be a positive integer");
		return;
		}
		System.out.println("The GCD of " + na + " and " + nb + " is " + ngcd(na, nb) +"•");

	}

}
