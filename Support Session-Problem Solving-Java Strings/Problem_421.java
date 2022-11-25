import java.util.Scanner;

public class Problem_421 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int format1 = 3;
		int format2 = 2;
		int format3 = 4;

		System.out.print("Enter a SSN: ");
		String str = input.nextLine();
		String[] arr = str.split("-");

		if (arr[0].length() == format1 && arr[1].length() == format2 && arr[2].length() == format3) {
			System.out.println(str + " is a valid SSN");
		} else
			System.out.println(str + " is not a valid SSN");
		
//		System.out.println(arr[0].length());
//		System.out.println(arr[1].length());
//		System.out.println(arr[2].length());

	}

}
