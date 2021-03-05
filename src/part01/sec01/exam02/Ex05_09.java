package part01.sec01.exam02;

import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int i;
		int dan;

		System.out.print("몇단? ");
		dan=s.nextInt();
		
		for(i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		
		s.close();
	}

}
