package test;

import java.util.Scanner;

//Ŭ���� ����
public class Test2 {
//�ڹ� ������Ʈ�� �������� �� ���۵Ǵ� ��ġ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	{}:�߰�ȣ
    //  []:���ȣ
    //  ():�Ұ�ȣ
		System.out.println("Hello world!!");		
		
		
		 //�ʴ����� �Է��ϼ���
		
			Scanner scan1 = new Scanner(System.in);
			
			int sec;
			System.out.print("�ʸ� �Է��ϼ���:");
			sec=scan1.nextInt();
			int h=sec/3600;   //�ð��� �Է¹ޱ� ���� ����	
			int g=sec%3600;   //�� ó������ ����                 
			int m=g/60;       //�� ó���� ���� ���� 	
			int s=sec%60;     //�� ó���� ���� ����
 			System.out.print(h+"�ð�"+m+"��"+s+"���Դϴ�");
 			
 			
 			
 			
			 
			 
 		    /*
 		     * ��ٸ��� �� ���� ���̸� �Է� �޾� ���̸� ����ϴ� ���α׷��� 
 		     * �ۼ��Ͻÿ�.
 		     */
			int lotte;
			System.out.print("���̸� ����ϼ���:");
			lotte=scan1.nextInt();
		    int vip;
		    System.out.print("������ ����ϼ���:");
			vip=scan1.nextInt();
			int tik;
			System.out.print("�Ʒ����� ����ϼ���:");
			tik=scan1.nextInt();
			
			
		    
		
		
	
      }
}