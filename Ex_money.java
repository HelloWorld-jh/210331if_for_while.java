
public class Ex_money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int P[] = new int[9]; //���� ȭ���� �ż�
		int T[] = new int[9]; //���� ȭ���� �հ�
		int C = 532560; //ȫ�浿�� 532560
		int R = C;
		int M = 10000;
		int SW = 1;
				
		for(int K=0; K<9; K++){
			P[K] = R/M;
			T[K] = T[K]+P[K];
			R = R-(P[K]*M);
			if (SW == 1) { // 1�̸� 10000��, 1000��,100��, 10��
				M = M/2;
				SW = 0;
				
		}
			else { 	//0�̸� 5000��, 500��, 50��
				M = M/5;
				SW = 1;
					}
			}
	}
	{

		for(int i=0; i<9; i++) {
	System.out.print(P[i]+"\t");
System.out.println();


}
}
}

