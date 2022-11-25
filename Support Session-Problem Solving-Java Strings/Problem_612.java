
public class Problem_612 {

	public static void printChars(char ch1,char ch2,int numberPerLine) {
		int count = 1;
		for(char ch=ch1;ch<=ch2;ch++) {
			System.out.print(ch+" ");
			if(count==10) System.out.println();
			count++;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printChars('l','z',10);
	}

}
