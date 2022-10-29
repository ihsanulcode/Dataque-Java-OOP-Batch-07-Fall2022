
public class MethodOverloading {

	public static void main(String[] args) {

		int ans1 = sum(1, 2);
		int ans2 = sum(1, 2, 3);
		
		System.out.println(ans1);
		System.out.println(ans2);

	}

	public static int sum(int a, int b) {
		return a+b;
	}

	public static int sum(int a, int b, int c) {
		return a+b+c;
	}

	// same method name but different parameter

}
