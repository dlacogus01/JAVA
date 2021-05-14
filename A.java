package staticClass;

public class A {
	    int aaa;
		public A() {
		aaa =1;
		System.out.println("나는 A클래스의 생성자입니다.");
		}
		
		public A(int aaa) {
			this.aaa = aaa;
			System.out.println("나는 A클래스의 인자가 하나인 생성자입니다.");
		}
	
}
