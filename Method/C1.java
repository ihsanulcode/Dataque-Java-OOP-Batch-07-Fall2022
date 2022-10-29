
public class C1 {

	public static void main(String[] args) {
		
		f1();
		System.out.println(sum());
		System.out.println(sum1(20,30));
		calc(4,5);
	}
	
	public static void f1() {
		System.out.println("Hello from f1");
	}
	
	public static int sum() {
		int temp = 5+5;
		return temp;
	}
	
	public static int sum1(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void calc(int x,int y) {
		System.out.println("Summation: "+(x+y));
		System.out.println("Subtraction: "+(x-y));
		System.out.println("Multiplication: "+(x*y));
	}

}
