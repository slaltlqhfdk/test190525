package today;

import java.util.Scanner;

public class today0429 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
        /*
         * 사다리꼴 각 변의 길이를 입력 받아 넓이를 
         * 계산하는 프로그램을 작성하시오
         * 넓이=(아랫변+윗변)*높이/2
         *
         * 
         * 
         */
		Scanner scan2 = new Scanner(System.in);
		int lotte;
		int vip;
		int tik;
		int tok;
		
		
		System.out.print("높이를 입력하세요:");
		lotte=scan2.nextInt();
	    System.out.print("윗변를 입력하세요:");
		vip=scan2.nextInt();
		System.out.print("아랫변를 입력하세요:");
		tik=scan2.nextInt();
		tok=(lotte+vip)*tik/2;
		System.out.print("넓이는:"+tok);
		
		
		
		
		
		
		
		
		
		
		
	}

}
