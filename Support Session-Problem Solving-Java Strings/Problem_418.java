import java.util.Scanner;

public class Problem_418 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two characters: ");
		String str = input.next();
		char a = str.charAt(0);
		char b = str.charAt(1);

		switch (a) {
		case 'M':
			System.out.print("Mathematics ");
			break;
		case 'C':
			System.out.print("Computer Science ");
			break;
		case 'I':
			System.out.print("Information Technology ");
			break;
		default:
			System.out.println("Invalid input");
		}

		switch (b) {
		case '1':
			System.out.print("Freshman");
			break;
		case '2':
			System.out.print("Sophomore");
			break;
		case '3':
			System.out.print("Junior");
			break;
		case '4':
			System.out.print("Senior");
			break;
		default:
			System.out.println("Invalid input");
		}

	}

}
