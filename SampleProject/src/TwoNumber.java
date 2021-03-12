import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) {
		// 두 정수를 입력받아 사칙연산의 결과를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("첫 번째 정수 : ");
		a = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %2f\n", a, b,(double)a/b);

	}

}
