package week1.day2;


public class MyMobile {

	Double	Price = 126478.50D;
	String Brand = "IPhone";
	int Storage = 128;
	

	public void makeCall() {
	System.out.println("Calling");
	}
	
	public void sendMsg() {
	System.out.println("Message has been sent");	
	}
		
	private void payBills() {
		System.out.println("Bill Paid");
	}
		
	
	public static void main(String[] args) {
		MyMobile obj = new MyMobile();
		System.out.println("Price : " +obj.Price);
		System.out.println("Brand : " +obj.Brand);
		System.out.println("Storage : " +obj.Storage);
		obj.makeCall();
		obj.sendMsg();
		obj.payBills();
	}

	}

