package staticClass;

public class ColorPointTest {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 4, "red");
		cp.showColorPoint();
		
		Point p;
		
		p=cp;
		
		System.out.println(p.x);
		

	}

}
