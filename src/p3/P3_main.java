package p3;

public class P3_main {

	public static void main(String[] args) {
		boolean x = false, y = false;
		
		if(!(x!=y && x==y)) {
			System.out.println("a ist wahr");
		}
		else {
			System.out.println("a ist falsh");
		}
		
		if(x || true) {
			System.out.println("b ist wahr");
		}
		else {
			System.out.println("b ist falsch");
		}
		
		if(x && false) {
			System.out.println("c ist wahr");
		}
		else {
			System.out.println("c ist falsch");
		}
		
		if((x&&!y) || (!x)) {
			System.out.println("d ist wahr");
		}
		else {
			System.out.println("d ist falsch");
		}
		// TODO Auto-generated method stub

	}

}
