import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//getting the number of student from user
		System.out.print("Enter the number of student: ");
		int n = input.nextInt();
		input.nextLine();
		
		//declaring arrays
		String[] name = new String[n];
		int[] id = new int[n];
		double[] cgpa = new double[n];
		
		//getting student information from user input
		System.out.println("\nEnter Student Info\n");
		for (int i = 0; i < n; i++) {
			System.out.println("Student "+(i+1)+":");
			System.out.print("Name: ");
			name[i] = input.nextLine();
			System.out.print("Id: ");
			id[i] = input.nextInt();
			input.nextLine();
			System.out.print("Cgpa: ");
			cgpa[i] = input.nextDouble();
			input.nextLine();
			System.out.println();
		}
		
		//print all student information
		double sum = 0;
		System.out.println("\n\n\t--- Student Info ---\n");
		for (int i = 0; i < n; i++) {
			System.out.println("Student "+(i+1)+":");
			System.out.println("Name: "+name[i]);
			System.out.println("ID: "+id[i]);
			System.out.println("CGPA: "+cgpa[i]);
			System.out.println();
			sum += cgpa[i];
		}
		
		//average calculate
		double avgCgpa = sum/(double)n;
		System.out.println("\nAverage Cgpa: "+avgCgpa);
		System.out.println();
		
		//find max index
		double maxCgpa = cgpa[0];
		int maxIndex = 0;
		
		for (int i = 0; i < n; i++) {
			if(cgpa[i]>maxCgpa) {
				maxCgpa = cgpa[i];
				maxIndex = i;
			}
		}
		
		//find min index
		double minCgpa = cgpa[0];
		int minIndex = 0;
		
		for (int i = 0; i < n; i++) {
			if(cgpa[i]<minCgpa) {
				minCgpa = cgpa[i];
				minIndex = i;
			}
		}
		
		//print max student
		System.out.println("\n\n\t--- Max Student ---\n");
		System.out.println("Name: "+name[maxIndex]);
		System.out.println("ID: "+id[maxIndex]);
		System.out.println("CGPA: "+cgpa[maxIndex]);
		
		//print min student
		System.out.println("\n\n\t--- Min Student ---\n");
		System.out.println("Name: "+name[minIndex]);
		System.out.println("ID: "+id[minIndex]);
		System.out.println("CGPA: "+cgpa[minIndex]);
		System.out.println();
		
	}

}
