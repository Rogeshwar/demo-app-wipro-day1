class item{
	private String t;
	private String a;
	private int p;
	public void Set(String t,String a,int p){
		this.t=t;
		this.a=a;
		this.p=p;
	}
	
	public String Gettitle(){
		return t;
	}
	public String Getauthor(){
		return a;
	}
	public int Getpublicationyear(){
		return p;
	}
	public void Display(){
		System.out.println("Title of the book : " + t);
		System.out.println("Author of the book : " + a);
		System.out.println("Publicationyear of the book : " + p);
	}
	
}

class Book extends item{
	public void  genre(String t,String a,int p,String g){
		 super.Set(t,a,p);
	     Display();
		System.out.println("Genre of the book : " + g);
	}
	
}

class Magazine extends item{
	public void issueNumber(String t,String a,int p,int i){
		super.Set(t,a,p);
	    Display();
		System.out.println("Issuenumber of magazine : "+ i);
	}
	
}

public class inher {
	public static void main(String[]args) {
		Book b=new Book();
		b.genre("wipro","Srinivas Pallia",1945,"java");
		Magazine m=new Magazine();
		m.issueNumber("wipro","Srinivas Pallia",1945,1234);
		
	}

}
