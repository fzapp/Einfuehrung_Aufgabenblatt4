package h1;

public class H1_main {

	public static void main(String[] args) {
		int zone = 14;
		double price = 3.44;
		
		price = 0;
		switch(zone) {
		case 4:
			price = 2.85;
			break;
		case 5:
			price +=0.7;
		case 3:
			price +=0.7;
		case 2:
			price +=0.35;
		case 1:
			price +=2;
			break;
		default:
			price = 4;
			break;
		
			
			
		}
		// TODO Auto-generated method stub

	}

}
