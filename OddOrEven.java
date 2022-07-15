package week1.day2;

public class OddOrEven {
	
	public static void main(String[] args) {
		int input = 133;
		int condition = input%2;
		if(condition==0) {
			System.out.println(input + " is Even");
		}
		else {System.out.println(input + " is Odd");}		
	}
}