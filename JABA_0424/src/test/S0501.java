package test;

import java.util.Scanner;

public class S0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     /* 1�ܰ�
	      * 1���� 100������ ���� �߿��� 3�� ������� ����ϼ���(3�� ��� ���� :3���� ������ �� �������� 0)
	      * 2�ܰ�
	      * 1���� 100������ ���� �߿��� 3�� ��� ���� ����ϼ���
	      * if(i%3==0)
	      */

	    int sum=0;
	   
	    System.out.println("1~100������ ���� �߿��� 3�� ������� ����ϼ���");
	   
	     
	    for(int i=1 ; i <= 100 ;i++) {
	   	
	    	if(i%3==0) {
	   	     	System.out.println("3�� ��� :"+i);
	    
	   	     	
	   	     	sum+=i;
	   	     	

	   	     	
	   	     	
	   	     	
	
	   	     
	   	     
	   	     
	         
	 
	   	
	    	}
	
	    }
         
	    System.out.println(sum);
	
	
	

	
	}

}
