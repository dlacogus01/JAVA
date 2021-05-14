package staticClass;

public class C {
	int ccc;
	public C() {
		ccc =3;
		System.out.println("나는 C클래스의 생성자입니다.");
		}
	
	public C(int ccc) {
		this.ccc = ccc;
		System.out.println("나는 C클래스의 인자가 하나인 생성자입니다.");
	}
}
