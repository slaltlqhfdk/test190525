package test;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 출력문
		// 출력을 입력하고 마지막에 0을 입력하세요
		// 스캔 입력 >>10 30 -20 40 0 입력한 수는 4개이고 평균은 15입니다.

		Scanner scan = new Scanner(System.in);		
		int num1 = 0; // 숫자 입력을 위한 변수
		int num2 = 0; // 합계 계산을 위한 변수
		int num3 = 0; // 숫자 갯수를 세기 위한 변수
		int num4= 0;   //평균값 변수
		boolean run = true; // while 문 제어를 위한 변수
		while (run) {
			System.out.print("숫자를 입력하세요:");
			num1 = scan.nextInt();
			if(num1!=0) {// 0 이 아니면 계속 실행한다. while문을 썻기 때문에 계속 반복되고  if는 조건만 만족하고 실행은 게속 되지않는다
				num2 = num2 + num1; 
				num3++; //  이 절은 입력한 수의 개수를 알려준다(while 안에 if 안에 끝날때 플러가 된다)
				num4=num2/num3;    //num2는 합계의 변수이니깐 num2나누기 num3를 하면 된다
			}else{
				break;
			}
		}
		
				
			
			
			System.out.println("입력한 수"+num3+"평균 값"+num4+"입니다");
		
			 
			
				
				
		}
				
			}
