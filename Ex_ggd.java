package Week2.day3;

public class Ex_ggd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 세로로 출력하기
		for(int i=1; i<=9; i++) {//단수 2~9까지 증감 반복
			for(int j=1; j<=9; j++ ) { //1~9까지 곱해줄 숫자 증감 반복
				
				System.out.println(i+"*"+j+"="+i*j);
			
			}
			System.out.println(); // 세로간격 줄바꿈
		*/
	for(int i=1; i<=9; i++) { //1~9까지 곱해줄 숫자 증감 반복
		for(int j=2; j<=9; j++) {//단수
			System.out.print(j+"*"+i+"="+i*j+"\t"); // "\t"는 가로간격 8칸 줄바꿈
		}
	System.out.println(); //줄바꿈
	}
	}

}
