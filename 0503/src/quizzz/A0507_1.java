package quizzz;

import java.util.Scanner;

public class A0507_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String [] name = {"������", "������","ȣ����","������"};
		 * 
		 * System.out.println("�̸� :"+name[0]); System.out.println("�̸�:"+name[1]);
		 * System.out.println("�̸�:"+name[2]); System.out.println("�̸�:"+name[3]);
		 * //length �迭 ũ�⸦ ��ȯ(Return) for(int i = 0; i<name.length; i++) { //�ݺ� ������ ����ؼ�
		 * �� 4�� �� ���������� ���! System.out.println(name[i]); // 1<4������ �۾ƾ� �ϴϱ�
		 * (name.length=�迭 ũ��)
		 */

		/*
		 * �迭 ����� ���� ���� �ʰ� �迭 ũ�⸸ ����
		 * 
		 */
		// ũ�Ⱑ 3�̰� numbers��� �迭 ���� ����
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// ũŰ�� 3�� double, string �迭 ���� �����غ���
		double[] doublenumber = new double[3];
		for (int i = 0; i < doublenumber.length; i++) {
			System.out.println(doublenumber[1]);
		}

		// numbers�� �� �����ϱ� (doubleNumbers[0]=0.0;���� )
		numbers[0] = 1; // (string[0] ="���� ��";)
		numbers[1] = 2;
		numbers[2] = 3;
		for (int i = 0; i < numbers.length; i++) { // length�ȿ� ���ԵǴ� ���ڰ� �ؿ�
			System.out.println(numbers[i]);
		}

		/*
		 * 1. ũ�Ⱑ 3�� ������ �迭 ���� 
		 * 2. ��ĳ�ʸ� �̿��Ͽ� ���� 3�� �Է� 
		 * 3. �Էµ� ���� ����,��� ���
		 */
		Scanner scan = new Scanner(System.in);
		int[] number = new int[3]; // ����ִ� ũ���� ������ ����
		int sum = 0; // ���� ����
		int avg = 0; // ��� ����
		System.out.println("ù�� ° ��:"); // ù�� ° ���� �Է¹ޱ� ���� ��ĵ���� �Է¹���
		number[0] = scan.nextInt();
		System.out.println("�ι� ° ��:"); // �ι� ° ���� �Է¹ޱ� ���� ��ĵ���� �Է¹���
		number[1] = scan.nextInt();
		System.out.println("���� ° ��:"); // ���� ° ���� �Է¹ޱ� ���� ��ĵ���� �Է¹���
		number[2] = scan.nextInt();
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i]; // ���� �ݺ��� �Ͽ� number[0], [1], [2] ���� �� �Ѵ�

		}
		avg = sum / number.length; // �ѹ������� ������ ��հ�!
		System.out.println("��� ��:" + avg);

	
	}
	
	
	

}
