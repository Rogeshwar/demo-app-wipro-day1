class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class custom {
	
	public static void withdraw(int amount) throws InvalidAgeException{
		if(amount<0)
		{
			throw new InvalidAgeException ("amount is negative");
		}
		else
		{
			System.out.println("the amount withdraw : "+amount);
		}
	}
	public static void main(String[]args) {
		try
		{
			withdraw(-500);
		}
		catch(InvalidAgeException e) {
			System.out.println("Exception caught : "+ e.getMessage());
		}
	}
}
