class poly {
	public void cash() {
		System.out.println("cash 1 : ");
	}
	public void cash(int a) {
		System.out.println("cash 2 : " + a);
	}
	public void cash(int b,int c) {
		System.out.println("cash 3 : " + b +" , "+c);
	}
}
public class Moverloading {
	public static void main(String[]args) {
		poly p=new poly();
		p.cash();
		p.cash(5);
		p.cash(6,7);
	}
}
