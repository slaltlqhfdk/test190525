package test;

import java.util.Scanner;

public class F0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 ũ�⸦ ���������� �����ϱ�
		Scanner scan = new Scanner(System.in);
		int[] num;
		System.out.print("�����ϰ� ���� �迭ũ�� �Է�");
		int size = scan.nextInt();
		num = new int[size];
		System.out.println("num �迭 ũ��" + num.length);

		
		
		
		int[] ajax=null;
		boolean run = true;
		int max=0;
		int sum=0;
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.�л���| 2.�����Է�| 3.��������Ʈ| 4.�м�|5.����");
			System.out.println("------------------------------");
			System.out.println("����>");
			
			int check = scan.nextInt();
			
			if (check == 1) {//�л����� �Է¹޾� �迭ũ�⸦ ����
				System.out.print("�л� ��>");//1.�л��� �Է¹���.
				int student = scan.nextInt();
				ajax = new int[student];//2.�Է¹��� �� ��ŭ �迭ũ�⸦ ������.
										//->�迭ũ�� �����ϴ� ���?
			}
			else if (check==2) {//�迭�� ũ�⸸ŭ �л����� ������ ���� �Է�
				 for(int i=0; i<ajax.length; i++){//1.�迭�� ������ �Է��ϱ�.
			       System.out.println((i+1)+"�� ° �л� ����:");//2.�Է��� �ϳ��ϳ� �Ұ��̳�,�ݺ����� �����̳�
			       ajax[i]=scan.nextInt();//�ݺ����� ���ٸ�for���� �̿�.(�迭�� ���� ������ ����)
				
				 }
			}
				
			
			else if (check==3) {//�Էµ� �л����� �������
					 for(int i=0; i<ajax.length;i++) {//1.�迭�� �Էµ� ���� ��� ���
						 System.out.println(((i+1)+"�� ° �л� ����:"+ajax[i]));//2.����ϱ� ���� print tkdyd
					 }//3.�迭�� ��� ��Ҹ� ����ؾ� �ϴ� �ݺ��� ���
			}
				 
					 
			else if(check==4) {//�Էµ� ���� �ִ밪, ��� �� ���
						 for(int i=0; i<ajax.length; i++) {//�ִ밪 ���
						 if(max<ajax[i]) {//1.1�ִ� �� ����� ���� ����
						 max=ajax[i];//1,2,�ִ��� ã�� ���??
						 sum=sum+ajax[i];} //=>�񱳹��� �̿�??
					 }
						 
						 System.out.println("�ִ밪"+max+"��� �� "+((double)sum/ajax.length));
					 	/*
					 	 * 2. ��հ� ���
					 	 * 2.1����� ���ϱ� ���ؼ��� �հ� ���� �ʿ�
					 	 * 2.2 �հ谪�� ���??
					 	 * 2.3 ��� �� ����� ���� ������ ����??
					 	 */
			
				 
			}
				
				 
		}
	}
}


				 
				 
				 
			
