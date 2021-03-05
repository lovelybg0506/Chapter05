package part01.sec01.exam03;

import java.io.IOException;
import java.io.InputStreamReader;

public class Problem05_03 {

	public static void main(String[] args) {
		InputStreamReader rd=new InputStreamReader(System.in); //키보드로부터 문자를 읽어들임
		char lowerBound;
		System.out.print("알파벳 한 문자를 입력하세요 : ");
		char c=0;
		int i,j;
		
		try {
			c=(char)rd.read();	// 여기를 읽었을때 어떤 에러가 발생하면	       // F(70) byte 2진수(0,1)
		} catch (IOException e) {	// 여기서 잡아서
			System.out.println("키보드 입력 중 오류가 발생했습니다."); // 이렇게 처리하겠다.
			
		}
		if((c<'a'||c>'z')&&(c<'A'||c>'Z')) {
			System.out.println("알파벳 문자가 아닙니다.");
		}
		
		if(c>'a'&&c<'z') {
				lowerBound='a';
		}else
				lowerBound='A';
		for(i=c;i>=lowerBound;i--) {
			for(j=lowerBound;j<i;j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
	
}


//}for(i=repeat;i>0;i--){ // 5,4,3,2,1		//행	(몇칸?)
//	for(j=0;j<i;j++) {						//열 (몇개?)
//		System.out.print('*');
//	}
//	System.out.println();