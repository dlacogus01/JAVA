package staticClass;

public class B {
	int bbb ;
	public B() {
		bbb =2;
		System.out.println("나는 B클래스의 생성자입니다.");
		}
	
	public B(int bbb) {
		this.bbb = bbb;
		System.out.println("나는B클래스의 인자가 하나인 생성자입니다.");
	}
}
