
public class Paypal extends PaymentMethod {
	public void processPayment(double amount) {
		System.out.println("Paypal payment processing");
		System.out.println("Paypal Amount : "+ amount);
		System.out.println("No payment fee");
		
	}

}
