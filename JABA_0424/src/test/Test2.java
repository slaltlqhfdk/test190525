package test;

import java.util.Scanner;

//클래스 선언문
public class Test2 {
//자바 프로젝트를 실행했을 때 시작되는 위치 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	{}:중괄호
    //  []:대괄호
    //  ():소괄호
		System.out.println("Hello world!!");		
		
		
		 //초단위를 입력하세요
		
			Scanner scan1 = new Scanner(System.in);
			
			int sec;
			System.out.print("초를 입력하세요:");
			sec=scan1.nextInt();
			int h=sec/3600;   //시간을 입력받기 위한 변수	
			int g=sec%3600;   //시 처를위한 변수                 
			int m=g/60;       //분 처리를 위한 변수 	
			int s=sec%60;     //초 처리를 위한 변수
 			System.out.print(h+"시간"+m+"분"+s+"초입니다");
 			
 			
 			
 			
			 
			 
 		    /*
 		     * 사다리꼴 각 변의 길이를 입력 받아 넓이를 계산하는 프로그램을 
 		     * 작성하시오.
 		     */
			int lotte;
			System.out.print("넓이를 계산하세요:");
			lotte=scan1.nextInt();
		    int vip;
		    System.out.print("윗변를 계산하세요:");
			vip=scan1.nextInt();
			int tik;
			System.out.print("아랫변를 계산하세요:");
			tik=scan1.nextInt();
			
			
		    
		
		
	
      }
}