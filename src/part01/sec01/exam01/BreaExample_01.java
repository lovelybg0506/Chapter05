package part01.sec01.exam01;

public class BreaExample_01 {

	public static void main(String[] args) { // 실행시 start
//		int num =0;
		while(true) { // 무한 반복
			int num=(int)(Math.random()*6)+1; // 최댓값5인 랜덤수+1 // 1~6
			System.out.println(num);
			
			if(num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
//		System.out.println(num);
		
	}

}
