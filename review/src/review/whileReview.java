package review;

import java.util.Scanner;

public class whileReview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count=0,n;
		double sum=0;
		
		System.out.println("정수 입력 후 마지막에 0을 입력하세요");
		
		
		
		while((n= sc.nextInt()) != 0) {
			sum+=n;
			count++;
		}
		System.out.println(count+"개의 정수를 입력했습니다.");
		System.out.println("입력한 정수의 평균은 "+(sum/count)+"입니다.");
		
		sc.close();
	
	
	
	
	
	
	
	}

}