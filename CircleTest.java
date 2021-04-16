
public class CircleTest {

	public static void main(String[] args) {
		Circle pizza = new Circle();
	    pizza.radius = 20;
	    pizza.name =  "자바 피자";
	    double area = pizza.getArea();
	    System.out.println(pizza.name + "의 면적은" + area);
	    
	    Circle donut = new Circle();
	    donut.radius = 5;
	    donut.name = "자바 도넛";
	    area = donut.getArea(); 
	    System.out.println(donut.name + "의 면적은" + area);
	}

}
