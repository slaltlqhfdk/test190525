package test;

import java.util.Scanner;

public class Since {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     //10��50�� �־� ���� ������ �ϼ���
		
		
		

		Scanner scan = new Scanner(System.in);
		int start,end;
		
		
		
		System.out.println("���� ���� ���⿡ ��������");
		start  = scan.nextInt();
	      	
		int sum=0;
		System.out.println("������ �� ���⿡ �־��");
          end= scan.nextInt();	
		 for(int i=start; i<=end;i++) {
		
			 sum*=i; 
			 
			 if(i==end) {
				 System.out.print(i+"="+sum);
			 }
			 
			 else {
				 System.out.print(i+"*");
				 
				 
				 
				 				
				 
			 }
			
		 }
		
		 	
		 	 
		 	
		 	
		 	
	
		 
	
	
	
	
	
	
	
	
	}

}
