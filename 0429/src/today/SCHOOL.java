package today;

import java.util.Scanner;

public class SCHOOL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Scanner scan = new Scanner(System.in);
	    int light=0;
	    int count=0;
	    int good=0;
	   
	    good=(int) (Math.random()*100)+1;  //1����100������ ���������� light�� ����    
	     
	    
	    do {  System.out.print("1�� 100������ ���� �Է��ϼ���:");
	    light=scan.nextInt(); //��ĵ�� ����Ʈ�� ������ �Ͽ��� 
	    	if(light>good) {  //����Ʈ�� �º��� ũ�� �������� �Է��ϼ��� ��� ��
	    		System.out.println("���� ���� �Է��ϼ���");
	    	}       //light�� ��ǻ�Ͱ� ������ ��
	    	else if(light<good) { //����Ʈ�� �º��� ������ ū���� �Է��ϼ��� 
	    		System.out.println("ū ���� �Է��ϼ���");
	    	}
	    	else 	{System.out.println("����");
	           
 	        }
	         count++;
	    }while (good!=light); //���� ����Ʈ�� ���̶� �ٸ��� ��� �ݺ��ȴ�
	     System.out.println(count);
	
	
	
	    
	    
	
	
	}

}
