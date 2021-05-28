package concept;

public class GenericTest {

	public static void main(String[] args) {
		GenericClass<Integer> a = new GenericClass<>();
		GenericClass<Double> b = new GenericClass<>();
		
		a.abc = 10;
		a.def = 20;
		b.abc = 10.0;
		b.def = 20.0;

	}

}
