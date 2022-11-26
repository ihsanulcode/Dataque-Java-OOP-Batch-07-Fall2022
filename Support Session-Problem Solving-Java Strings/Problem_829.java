import java.util.Scanner;

public class Problem_829 {
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < 3; i++) {
			boolean flag = false;
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] == m2[i][j] && !flag) {
					m2[i][j] = -1;
					flag = true;
					break;
				} else {
					for (int k = 0; k < 3; k++) {
						for (int m = 0; m < 3; m++) {
							if (m1[i][j] == m2[k][m] && !flag) {
								m2[k][m] = -1;
								flag = true;
								break;
							}
						}
					}
				}
			}
			if (!flag)
				return flag;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// declaration
		int a[][] = new int[3][3];
		System.out.println("Enter first array elements:");
		// getting input
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("[%d][%d]: ", i, j);
				a[i][j] = input.nextInt();
			}
		}

		// declaration
		int b[][] = new int[3][3];
		System.out.println("Enter second array elements:");
		// getting input
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("[%d][%d]: ", i, j);
				b[i][j] = input.nextInt();
			}
		}

		if (equals(a, b))
			System.out.println("Identical");
		else
			System.out.println("Not Identical");

	}

}
