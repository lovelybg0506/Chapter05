package part01.sec01.exam02;

public class Ex05_05 {

	public static void main(String[] args) {
		/*
		int hap;
		
		hap=1+2+3+4+5+6+7+8+9+10;
		
		System.out.printf("1에서 10까지의 합:%d\n",hap);
		*/
		
		int hap=0; //누적시키려면 초기화시켜야됨.
		int i;
		
		for(i=1;i<11;i++) {
			hap=hap+i;
		}
		System.out.printf("1부터 10까지의 합 :%d\n",hap);
		
		
	}

}
