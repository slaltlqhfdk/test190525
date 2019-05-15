package banana;

import java.util.Scanner;

public class revview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 점수와 학년을 합격 또는 불합격을 출력하는 프로그램 
		 * 1.1~3학년은 점수가 60점 이상이여야 합격 
		 * 2.4학년은 70점 이상이여야 합격
		 *  중첩 if문을 사용하세요.
		 */

		Scanner scan3 = new Scanner(System.in);

		int grade;
		System.out.println("몇학년이냐");
		grade = scan3.nextInt();
		int score;
		System.out.println("몇점이냐");
		score = scan3.nextInt();
		
		if (score >= 60) {
			if (grade <= 3) {
				System.out.println("합격");
			}
		}
		else if (score >= 70) {
			if (grade == 4){

				System.out.println("합격");
			}
		}
		else {
			System.out.println("병신 ㅋㅋ");	
		}
	}
}
