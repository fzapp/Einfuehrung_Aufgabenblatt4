package p2;

public class P2_main {

	public static void main(String[] args) {
		int a = 3, b = 5, c = 6;
		int intResult = 2342;
		double x = 1.5, y = 2.3;
		double doubleResult = 23.23;
		
		
		
		// TODO Auto-generated method stub
		
		//a) Der Ausdruck ist vom Typ int und hat den Wert -3; Die Zuweisung ist fehlerfrei
		//b) Der Ausdruck ist vom Typ int und hat den Wert 1; Die Zuweisung ist fehlerfrei
		//c) Der Ausdruck ist vom Typ int und hat den Wert 3; Die Zuweisung ist fehlerfrei
		//d) Der Ausdruck ist vom Typ int und hat den Wert 1; Es gibt Kompilierungsfehler
		//e) Der Ausdruck ist vom Typ int und hat den Wert 6; Es gibt Kompilierungsfehler
		//f) Der Ausdruck ist vom Typ double und hat den Wert 13.0; Die Zuweisung ist fehlerfrei
		
		intResult = c-a*3;
		
		intResult= c/b;
		
		intResult = a+b/c;
		
		doubleResult = (double) c/b;
		
		doubleResult = (double) c+a/b;
		
		doubleResult = x+y*b;
		
		

	}

}
