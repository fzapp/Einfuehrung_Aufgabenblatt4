package h2;

public class H2_main {

	public static void main(String[] args) {
		boolean x=true , y=false, a=true, b=true, c=true;
		int input = 10;
		
		
		if (input == 10 || input == 11) {
			x = true;
		}
		else {
			x = false;
		}
		
		if (input == 1 || input == 11) {
			y = true;
		}
		else {
			y = false;
		}
		
		if (x && y) {
			a = true;
		}
		else {
			a = false;
		}
		
		if (x || x!=y) {
			b = true;
		}
		else {
			b = false;
		}
		
		c = !y;
		
			
		}
		// TODO Auto-generated method stub

	}


