package Week2.day3;

public class Ex_for2 {
	for (int i=0; i<4; i++) { //0~5 �� ����
		for (int j = 0 ; j < i; j++) { // 0~5 �� ����
			System.out.print(" ");	//���� ���
		}
		for (int k=4; k>i; k--) {
			System.out.print("*");
		}
		for (int k=3; k>i; k--) {
			System.out.print("*");
		}
		System.out.println();
		}


for (int i =0; i<4; i++) {
	for (int j =3; j>i; j--) {
		System.out.print("");
		}
	for (int k=0; k<= i; k++) {
		System.out.print("*");
		
	}
	System.out.println();
}
}
}


