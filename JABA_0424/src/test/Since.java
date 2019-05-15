package test;

import java.util.Scanner;

public class Since {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     //10과50을 넣어 갑을 나오게 하세요
		
		
		

		Scanner scan = new Scanner(System.in);
		int start,end;
		
		
		
		System.out.println("시작 값을 여기에 넣으세요");
		start  = scan.nextInt();
	      	
		int sum=0;
		System.out.println("마지막 값 여기에 넣어요");
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
