package test;

import java.util.Scanner;

public class SSSSSSAVCZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4x+5y =60 �̶�� ���� ������
		// ���� �����ϴ� ��� �ظ� ���Ͻÿ� �� (x=5 ,y=8 x=10,y=4)

		/*
		 * int x,y ; for(x=0; x<=10; x++) { //x���� 0, 0���� x���� 10���� �۰ų� ���� �� �� ���� �ݺ��Ѵ�
		 * for(y=0; y<=10; y++) { //���� 0, 0���� y���� 10���� �۰ų� ���� �� �� ���� �ݺ��Ѵ�
		 * if((4*x)+(5*y)==60) { // if ���� �̿��Ͽ� 4�� �ִ� x���� 5�� �ִ� y����, // 1~10������ ���ڰ� ��
		 * 60�� �ɶ����� ���� �ٲ�� �������� ����� �Ѵ�. } } } System.out.println("x="+x+"y="+y);
		 */

		
		     //���� :������ �Է¹޾� Ȧ�� ���� ¦�������� ����ϰ� �� �Է��ϸ� ���α׷��� ����ǵ��� �ϼ���
	

		Scanner scan = new Scanner(System.in);
		int black; // ������ ���� ����
		do {
			System.out.println("���ڸ� �����ÿ�");

			black = scan.nextInt();

			if (black != 0) {  // black�� ���ڸ� �־�����  0���� �ƴϸ� �ؿ� ��øif���� ���� ��������

				if (black % 2 == 0) { //  black���� 2�� ������ ������ ���� 0 ������ ¦���� �Էµȴ�
					System.out.println("¦����");
				} else {             // 0�� �ƴϰ�  �ٸ����� ������ Ȧ�� 
					System.out.println("Ȧ����");
					
									}

			}
		} while (black  != 0); // 0�� �ƴϸ� ��� �ݺ��� �ǰ�    0���� �Ǹ� ����� �Ǵ°��̴� 

		System.out.println("��");

		
	}
	
	

}
