
public class np {
	public static void main(String[]args){
		try
		{
			String a=null;
			System.out.println(a.length());
		}
		catch (NullPointerException e) {
			System.out.println("Nullpointer Exception caught : " +e.getMessage());
		}
		finally {
			System.out.println("NullpointerException finally block executed");
		}
		
		try {
			int[] ar= {1,2,3,4,5};
			System.out.println(ar[8]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrayindex Exception caught : " + e.getMessage());
		}
		finally {
			System.out.println("ArrayIndexOutOfBoundsException finally bock executed");
		}
	 
	}
}
