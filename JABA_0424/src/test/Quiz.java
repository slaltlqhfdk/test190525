package test;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��¹�
		// ����� �Է��ϰ� �������� 0�� �Է��ϼ���
		// ��ĵ �Է� >>10 30 -20 40 0 �Է��� ���� 4���̰� ����� 15�Դϴ�.

		Scanner scan = new Scanner(System.in);		
		int num1 = 0; // ���� �Է��� ���� ����
		int num2 = 0; // �հ� ����� ���� ����
		int num3 = 0; // ���� ������ ���� ���� ����
		int num4= 0;   //��հ� ����
		boolean run = true; // while �� ��� ���� ����
		while (run) {
			System.out.print("���ڸ� �Է��ϼ���:");
			num1 = scan.nextInt();
			if(num1!=0) {// 0 �� �ƴϸ� ��� �����Ѵ�. while���� ���� ������ ��� �ݺ��ǰ�  if�� ���Ǹ� �����ϰ� ������ �Լ� �����ʴ´�
				num2 = num2 + num1; 
				num3++; //  �� ���� �Է��� ���� ������ �˷��ش�(while �ȿ� if �ȿ� ������ �÷��� �ȴ�)
				num4=num2/num3;    //num2�� �հ��� �����̴ϱ� num2������ num3�� �ϸ� �ȴ�
			}else{
				break;
			}
		}
		
				
			
			
			System.out.println("�Է��� ��"+num3+"��� ��"+num4+"�Դϴ�");
		
			 
			
				
				
		}
				
			}
