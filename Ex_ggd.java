package Week2.day3;

public class Ex_ggd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���η� ����ϱ�
		for(int i=1; i<=9; i++) {//�ܼ� 2~9���� ���� �ݺ�
			for(int j=1; j<=9; j++ ) { //1~9���� ������ ���� ���� �ݺ�
				
				System.out.println(i+"*"+j+"="+i*j);
			
			}
			System.out.println(); // ���ΰ��� �ٹٲ�
		*/
	for(int i=1; i<=9; i++) { //1~9���� ������ ���� ���� �ݺ�
		for(int j=2; j<=9; j++) {//�ܼ�
			System.out.print(j+"*"+i+"="+i*j+"\t"); // "\t"�� ���ΰ��� 8ĭ �ٹٲ�
		}
	System.out.println(); //�ٹٲ�
	}
	}

}
