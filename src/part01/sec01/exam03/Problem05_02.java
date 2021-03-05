package part01.sec01.exam03;

import java.util.Scanner;

public class Problem05_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int repeat;
		int i,j;
		
		System.out.print("임의의 정수를 입력하세요>>");
		repeat = s.nextInt();
		// 입력된값이 음수x, 0보다 커야함,
		if (repeat <= 0) {
			System.out.println("0보다 커야 합니다.");
		}for(i=repeat;i>0;i--){ // 5,4,3,2,1		//행	(몇칸?)
			for(j=0;j<i;j++) {						//열 (몇개?)
				System.out.print('*');
			}
			System.out.println();
		}
		s.close();
	}
}


//*****
//****
//***
//**
//*