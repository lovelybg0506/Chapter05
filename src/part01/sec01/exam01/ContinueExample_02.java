package part01.sec01.exam01;

public class ContinueExample_02 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2 !=0) {
				continue; // i++로돌아가서 계속 반복해라 라는뜻, 즉 홀수이면 반복해라
			}
			System.out.println(i);
		}
	}
}
