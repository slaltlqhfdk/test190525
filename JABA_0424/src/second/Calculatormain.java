package second;

import java.util.Scanner;

public class Calculatormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Calculator Ŭ������
		 * ���簢��,���簢�� ���̸� ���ϴ� �޼ҵ带 ����
		 * �����ϰ� 
		 * CaluclatorMain Ŭ�������� �����޼ҵ带 ȣ��
		 * �Ͽ� ���� ���̸� ����ϼ���.
		 * (�� ���� ���̴� �������)
		 */
		int width;
		int height;
		
		
		Scanner scan =new Scanner(System.in);
		Calculator Gold1= new Calculator();
		//���簢�� ���� ��� �޼ҵ� ȣ��
		Gold1.Gold(5);
		//���簢�� ���� ��� �޼ҵ� ȣ��
		Gold1.Gold(5,10);
		
		System.out.println("���簢�� ���� ����:");
		width=scan.nextInt();
		System.out.println("���簢��  ���� ����:");
		height=scan.nextInt();
		
		//���簢�� ���� ��� �޼ҵ� ȣ��
		int area=Gold1.Gold(width,height);
		System.out.println("���簢�� ����:"+area);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
