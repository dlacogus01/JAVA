import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int intArray[];
		intArray = new int[5];
		int max = -2147483648, min = 2147483647, sum =0;
		System.out.print("���� 5�� �Է� : ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scn.nextInt();
			sum += intArray[i];
			if(intArray[i] > max)			max = intArray[i];
			if(intArray[i] < min)			min = intArray[i];
				
		}
		System.out.println("�Է��� ���� �߿� �ִ� = " + max);
		System.out.println("�Է��� ���� �߿� �ּҰ� = " + min);
		System.out.println("�Է��� ������ ��հ� = " + (sum/5.0));
		scn.close();
	}

}
