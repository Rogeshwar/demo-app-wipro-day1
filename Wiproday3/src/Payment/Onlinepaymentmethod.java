package Payment;

public class Onlinepaymentmethod {
	public static void main(String[]args) {
		PaymentMethod credit=new CreditCard();
		PaymentMethod paypal=new Paypal();
		
		System.out.println("CreditCard Transaction");
		credit.processPayment(500);
		System.out.println("Paypal Transaction");
		paypal.processPayment(500);
	}
}
