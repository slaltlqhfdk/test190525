package second;

import java.util.Scanner;

public class seconddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * (if~else )문 연습 score라는 변수값이 90이상이면 A등급입니다. 출력 90미만이면 B등급입니다.출력
		 * 
		 * 
		 */
		int score = 93;
		if (score >= 98) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
			

		}

		else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");

		}
		/*
		 * 90보다 크면 +A 90이면 A 90미만이면 B
		 */

		int call = 95;
		if (call > 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A+입니다");
		} else if (call == 90) {
			System.out.println("점수가 90 입니다");
			System.out.println("등급은 A 입니다");
		} else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B 입니다");

		}

		/*
		 * 점수를 스캔으로 입력받아서 
		 * 90~100 점이면 A 
		 * 80~89 점이면 B 
		 * 70~79 점이면 C 
		 * 60~69 점이면 D 
		 * 60점 미만이면 F를
		 * 출력하는 프로그램
		 * 스캐너 선언을 하고  점수 입력을 위한 변수 선언!
		 *  
		 */
		
		Scanner scan3 = new Scanner(System.in);
         
		int party;
		System.out.print("너는 몇점이니?");
		party = scan3.nextInt();
		
		

		if (party > 90 && party < 100){		
			System.out.println("90~100점이면 A");
		}

		else if (party >= 80 && party < 89) {
			//party >=80
			System.out.println("80~89점이면 B");
		}

		else if (party >= 70 && party < 79) {
			//party>=70
			System.out.println("70~79점이면 C");
		}

		else if (party >= 60 && party < 69) {
			//party>=60
			System.out.println("60~69점이면 D");
		}
		if (party < 60) {
			System.out.println("60점미만이면 F");
			
			
			
                                  
		}

	}
}
