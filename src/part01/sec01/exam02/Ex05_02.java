package part01.sec01.exam02;

public class Ex05_02 {

	public static void main(String[] args) {
		
		int i;
//		int j;
		
		for(i=0;i<5;i++) 
			System.out.println("안녕하세요?빙글빙글 for문을 공부 중입니다.");// 이 줄만 반복
			System.out.println("for문은 반복문 중에서 가장 많이 사용합니다.");// 이 줄은 한번.
	
		for(i=0;i<3;i++) {	// 기존의 변수(i)를 초기화시켜 재사용 가능하다
			System.out.println("안녕하세요?");
			System.out.println("##반갑습니다.");
		}
		/*
		for(j=0;j<3;j++) {	 			
			System.out.println("안녕하세요?2");
			System.out.println("##반갑습니다.2");
		}
		*/
	}
	
}
