package Payment;

public class CreditCard extends PaymentMethod {
	public void processPayment(double amount) {
		double fee = amount *0.05;
		double total = amount + fee;
		System.out.println("Creditcard payment processing");
		System.out.println("Creditcard Amount : "+ amount);
		System.out.println("Creditcard payment fee : "+ fee);
		System.out.println("Creditcard total amount : "+ total);
	}
}
