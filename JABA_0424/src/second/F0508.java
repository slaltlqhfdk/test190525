package second;

import java.util.Scanner;

public class F0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ���� ���ϱ�
		// ��)2680�� �Է��ϸ� 500�� 5�� 100��6�� 50��1��10��3��

		Scanner scan = new Scanner(System.in);
		int[] couque = { 500, 100, 50, 10, 1};//500�� 100�� 50�� 10�� 1�� �� ���������� ��Ʈ�� ������ �����ϰ� �־���
		int money = scan.nextInt(); //�ݾ��� �������� �������� �� ��ĵ

		System.out.println("money=" + money); //���������ݾ��� ����Ʈ

		for (int i = 0; i < couque.length; i++) {//

			System.out.println(couque[i] + "��" + money / couque[i]);// ��ũ������ ���� ���������� ������ �Ű�//2680/500=��:5 
			// �� �ڿ���  (money)�� ��ũ 500.,100,50,�ϳ��� ������ ������ ���� 500�� 100�� 50�� �� ������ ���´�
			money %= couque[i];//2680%500=180

		}

	}

}
