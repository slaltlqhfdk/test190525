package banana;

import java.util.Scanner;

public class revview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ������ �г��� �հ� �Ǵ� ���հ��� ����ϴ� ���α׷� 
		 * 1.1~3�г��� ������ 60�� �̻��̿��� �հ� 
		 * 2.4�г��� 70�� �̻��̿��� �հ�
		 *  ��ø if���� ����ϼ���.
		 */

		Scanner scan3 = new Scanner(System.in);

		int grade;
		System.out.println("���г��̳�");
		grade = scan3.nextInt();
		int score;
		System.out.println("�����̳�");
		score = scan3.nextInt();
		
		if (score >= 60) {
			if (grade <= 3) {
				System.out.println("�հ�");
			}
		}
		else if (score >= 70) {
			if (grade == 4){

				System.out.println("�հ�");
			}
		}
		else {
			System.out.println("���� ����");	
		}
	}
}
