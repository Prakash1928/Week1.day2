package week1.day2;

public class PositiveOrNegative {
	
	public void Check() {
		int Input = 1;
		if(Input >0) {
			System.out.println(Input + " is positive");
		}
		if (Input<0) {
			System.out.println(Input + " is Negative");
	}
		if (Input==0) {
			System.out.println(Input + " is neither positive nor negative");
	}	
	}
	public static void main(String[] args) {
		PositiveOrNegative obj = new PositiveOrNegative();
		obj.Check();	
	}

}
