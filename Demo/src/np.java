
public class np {
	public static void main(String[]args){
		try
		{
			String a=null;
			System.out.println(a.length());
		}
		catch (NullPointerException e) {
			System.out.println("Exception caught : " +e.getMessage());
		}
		finally {
			System.out.println("Finally block executed");
		}
	 
	}
}
