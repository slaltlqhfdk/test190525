package second;

import java.util.Scanner;

public class seconddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * (if~else )�� ���� score��� �������� 90�̻��̸� A����Դϴ�. ��� 90�̸��̸� B����Դϴ�.���
		 * 
		 * 
		 */
		int score = 93;
		if (score >= 98) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
			

		}

		else {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B �Դϴ�.");

		}
		/*
		 * 90���� ũ�� +A 90�̸� A 90�̸��̸� B
		 */

		int call = 95;
		if (call > 90) {
			System.out.println("������ 90���� Ů�ϴ�");
			System.out.println("����� A+�Դϴ�");
		} else if (call == 90) {
			System.out.println("������ 90 �Դϴ�");
			System.out.println("����� A �Դϴ�");
		} else {
			System.out.println("������ 90���� �۽��ϴ�");
			System.out.println("����� B �Դϴ�");

		}

		/*
		 * ������ ��ĵ���� �Է¹޾Ƽ� 
		 * 90~100 ���̸� A 
		 * 80~89 ���̸� B 
		 * 70~79 ���̸� C 
		 * 60~69 ���̸� D 
		 * 60�� �̸��̸� F��
		 * ����ϴ� ���α׷�
		 * ��ĳ�� ������ �ϰ�  ���� �Է��� ���� ���� ����!
		 *  
		 */
		
		Scanner scan3 = new Scanner(System.in);
         
		int party;
		System.out.print("�ʴ� �����̴�?");
		party = scan3.nextInt();
		
		

		if (party > 90 && party < 100){		
			System.out.println("90~100���̸� A");
		}

		else if (party >= 80 && party < 89) {
			//party >=80
			System.out.println("80~89���̸� B");
		}

		else if (party >= 70 && party < 79) {
			//party>=70
			System.out.println("70~79���̸� C");
		}

		else if (party >= 60 && party < 69) {
			//party>=60
			System.out.println("60~69���̸� D");
		}
		if (party < 60) {
			System.out.println("60���̸��̸� F");
			
			
			
                                  
		}

	}
}
