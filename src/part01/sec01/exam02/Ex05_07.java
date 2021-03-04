package part01.sec01.exam02;

import java.util.Scanner;

public class Ex05_07 {

	public static void main(String[] args) {

		int hap=0;
		int i;
		int num;
		Scanner s=new Scanner(System.in);
		System.out.printf("값 입력: ");
		
		num=s.nextInt();
		
		for(i=1;i<=num;i++) {
			hap=hap+i;
		}
		
		System.out.printf("1에서 %d까지의 합:%d\n",num,hap);
		//for 키보드로 부터 입력 받은 값 만큼 1부터 합을 구한다
		
		
		s.close();
		

	}

}
