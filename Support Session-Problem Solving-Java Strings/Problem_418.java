import java.util.Scanner;

public class Problem_418 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two characters: ");
		String str = input.next();
		char a = str.charAt(0);
		char b = str.charAt(1);

		boolean isValid = true;
		String text = "";
		
		switch (a) {
		case 'M':
			text = "Mathematics ";
			break;
		case 'C':
			text = "Computer Science ";
			break;
		case 'I':
			text = "Information Technology ";
			break;
		default:
			isValid = false;
			//System.out.println("Invalid input");
		}

		switch (b) {
		case '1':
			text += "Freshman";
			break;
		case '2':
			text += "Sophomore";
			break;
		case '3':
			text += "Junior";
			break;
		case '4':
			text += "Senior";
			break;
		default:
			isValid = false;
			//System.out.println("Invalid input");
		}
		
		if(!isValid) System.out.println("Invalid input");
		else System.out.println(text);

	}

}
