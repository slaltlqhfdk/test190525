package today;

import java.util.Scanner;

public class today0429 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
        /*
         * ��ٸ��� �� ���� ���̸� �Է� �޾� ���̸� 
         * ����ϴ� ���α׷��� �ۼ��Ͻÿ�
         * ����=(�Ʒ���+����)*����/2
         *
         * 
         * 
         */
		Scanner scan2 = new Scanner(System.in);
		int lotte;
		int vip;
		int tik;
		int tok;
		
		
		System.out.print("���̸� �Է��ϼ���:");
		lotte=scan2.nextInt();
	    System.out.print("������ �Է��ϼ���:");
		vip=scan2.nextInt();
		System.out.print("�Ʒ����� �Է��ϼ���:");
		tik=scan2.nextInt();
		tok=(lotte+vip)*tik/2;
		System.out.print("���̴�:"+tok);
		
		
		
		
		
		
		
		
		
		
		
	}

}
