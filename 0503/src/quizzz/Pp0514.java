package quizzz;

import java.util.Scanner;

public class Pp0514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//��ĳ�� ����
		  	Scanner scan=new Scanner(System.in);
			//��ü ����
		  	P0514 login=new P0514();
		  	boolean run = true;
	
		    while(run) {
		    	System.out.println("------------");
		    	System.out.println("������ ���񽺸� �������ּ���");
		    	System.out.println("1.�α���|2.�α׾ƿ�|3.����");
		    	System.out.println(">>");
		    	int choice=scan.nextInt();
		    	switch(choice) {
		    	case 1:
		    		//id,pw �Է¹޾Ƽ�
		    		//�α��� ó���� �޼ҵ� ȣ��
		    	System.out.println("���̵� �Է��ϼ���:");
		    	String id=scan.next();
		    	System.out.println("��й�ȣ�� �Է��ϼ���");
		    	String PW=scan.next();
		    	//��ü�� �ִ� �α��� ó���� �޼ҵ� ȣ��
		    	login.login1(id,PW);
		    	
		    	
		    	
		    	}
		    
		    
		    }
	
	
	
	
	}

}
