package P2;

import P1.*;

public class C2P2 extends C1P1 {
	int c;

	public C2P2() {
	}

	public C2P2(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}

	@Override
	public String toString() {
		return "C2P2 [c=" + c + ", a=" + a + ", b=" + b + "]";
	}
	
	
}
