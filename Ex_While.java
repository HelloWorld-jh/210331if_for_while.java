package Week2.day3;

import java.util.Scanner;

public class Ex_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~10����
//		int sum=0;
//		for ( int i=1; i<=10; i++) {
//			
//			sum +=i; // sum= sum+1
//		}
//		
//		System.out.println(sum); f11�� ��´���Ű
	
		// �� �Է� => �״�� ��� ( �Է¹��� ���� 0�� �ƴҶ� ���� )
		/*
		int num;
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		while(num !=0) {
			System.out.println(num);
			num = sc.nextInt();
		}
		
		System.out.println("0�� �Է��ϼ̱���. �����մϴ�");
	*/
		int num;
		Scanner sc = new Scanner(System.in);
		while(true) {
			num = sc.nextInt();
			if(num == 0) break;	// Ż���ڵ� break
			System.out.println(num);
		}
			System.out.println("0�� �Է��ϼ̱���. �����մϴ�");
			
			
			
			
			
	}
	

}
