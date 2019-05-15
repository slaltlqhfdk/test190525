package test;

import java.util.Scanner;

public class SSSSSSAVCZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4x+5y =60 이라는 식이 있을때
		// 식이 성립하는 모든 해를 구하시오 답 (x=5 ,y=8 x=10,y=4)

		/*
		 * int x,y ; for(x=0; x<=10; x++) { //x값은 0, 0부터 x값이 10보다 작거나 같아 질 때 까지 반복한다
		 * for(y=0; y<=10; y++) { //값은 0, 0부터 y값이 10보다 작거나 같아 질 때 까지 반복한다
		 * if((4*x)+(5*y)==60) { // if 절을 이용하여 4에 있는 x값과 5에 있는 y값이, // 1~10까지의 숫자가 들어가
		 * 60이 될때까지 값이 바뀌고 같아지면 출력을 한다. } } } System.out.println("x="+x+"y="+y);
		 */

		
		     //문제 :정수를 입력받아 홀수 인지 짝수인지를 출력하고 을 입력하면 프로그램이 종료되도록 하세요
	

		Scanner scan = new Scanner(System.in);
		int black; // 삽입할 정수 선언
		do {
			System.out.println("숫자를 넣으시오");

			black = scan.nextInt();

			if (black != 0) {  // black에 숫자를 넣었을때  0값이 아니면 밑에 중첩if조건 절로 내려간다

				if (black % 2 == 0) { //  black값을 2와 나누고 나머지 값이 0 나오면 짝수로 입력된다
					System.out.println("짝수야");
				} else {             // 0이 아니고  다른값이 나오면 홀수 
					System.out.println("홀수야");
					
									}

			}
		} while (black  != 0); // 0이 아니면 계속 반복이 되고    0값이 되면 출력이 되는것이다 

		System.out.println("끝");

		
	}
	
	

}
