package quizzz;

import java.util.Scanner;

public class T0514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������ ���� ���α׷� 
		 * 1. ���ο� ���� ����Ҷ� �̸�,���¹�ȣ,�ʱ��Աݾ��� �Է���.
		 * ->�� ��� ����� 2���� ������� ����
		 *  1.1 ��ü ������ �Ű������� �����ϱ�
		 *  1.2 getter,setter �̿��ϱ�
		 * 2. ���� ����� ������ �� �ִ�.
		 * 3. ��� ������ ������ �� �ִ�.
		 *  3.1 �ܾ��� 0���̸����� �Ǹ� ��� �Ұ���
		 *  4. �ܾ� Ȯ�� ����� ������ �� �ִ�.
		 */
		Scanner scan=new Scanner(System.in);
	int menu=0,bank_num=0,fr_money=0;
    String name=null;
    
	System.out.println("�ȳ��ϼ���.����� ���� �� �޴��� �����ض�");
		
	System.out.println("���� ����� ���� �̸��� �ۼ��ϼ���:");
	name=scan.next();//�̸� �Է� ��ĵ�� �Է� �ް�
	System.out.println(name+"���� ���¹�ȣ:");
	bank_num=scan.nextInt();//���¹�ȣ �Է�����ĵ�ް�
	System.out.println(name+"���� ù �Ա��� �ݾ�:");
	fr_money=scan.nextInt();//�Ա��� �ݾ��� �Է� ��ĵ�� �ް�
	
	Tt0514 mybank=new Tt0514(name,bank_num,fr_money);//Ŭ������ ���Ṯ
	System.out.println("\n"+name+"���� ���� ����� �Ϸ�.");
	
	do {
		menu=mybank.menu_choice();//�޴� ���̽� �޼ҵ带 �ҷ��´�

		switch(menu){
			case 1:fr_money=mybank.money_input(fr_money);break;
			// mybank.money_input(fr_money)������ �Ա��� �Է��ϱ����� ����  
			case 2:fr_money=mybank.money_output(fr_money);break;
			//mybank.money_output(fr_money)������ ����� �Է��ϱ����� ����
 			case 3:System.out.println("�����ܾ�:"+fr_money);break;
			//
			case 4:System.out.println("���α׷��� ����.");break;
			//
			default:System.out.println("�߸��� �Է�.");break;
			//1,2,3,4�� �ƴϸ� �߸��� �Է��� ������ �ȴ�.		
		 }
		}while(menu!=4); // 4�� ġ�� �ݺ����� ����
		System.out.println("�̿����ּż� ����");
	//while���� ����Ǳ� ���ؼ� ()���� ���� false�� ���;��Ѵ�.
	
	
	
	}
}
