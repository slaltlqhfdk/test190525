package quizzz;

import java.util.Scanner;

public class Smile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int balance = 0; // �ܰ� ����

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.����| 2.��� | 3.�ܰ�| 4.����");
			System.out.println("------------------------------");
			System.out.println("����>");

			int check = scan.nextInt(); //check��  �Է��� �޴�

			if (check == 1) {
				System.out.print("���ݾ� :"); //���ݾ���  �߰� ������ �Ѵ�
				int input = scan.nextInt(); // ���ݾ� ��ǲ���� ���Ѵ�
				balance += input; // ��ǲ�� �ִ� �ݾ��� �߶����� ����
				System.out.println("�ܾ� :" + balance);  // �߶����� �ܾ��̴� 
 
			} else if (check == 2) {    
				System.out.print("��ݾ�:"); 
				int output = scan.nextInt(); //�ƿ�ǲ���� ������ �ߴ�
				if (balance < output) {  //�ܾ׺��� ��ݾ��� ������ �ܾ׺����� �߰� �ߴ�
					System.out.println("�ܾ׺���");
				} else {

					balance -= output;  // �ܾ׿��� ����Ѵ�
					System.out.println("�ܾ�:" + balance); 
				}
			} else if (check == 3) {    
				System.out.print("�ܰ�:");   //������ �ܰ�

				System.out.println("�ܰ�� :" + balance);
			} else {
				break;
			}
		}

	}

}
