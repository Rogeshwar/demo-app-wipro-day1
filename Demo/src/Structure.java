
public class Structure {
	public static void main(String[]args) {
		Shape shape[]=new Shape[4];
		shape[0]=new Circle();
		shape[1]=new Rectangle();
		shape[2]=new Circle();
		shape[3]=new Rectangle();
		
		for(Shape sh: shape) {
			sh.draw();
		}
	}

}
