package test;

import java.util.Scanner;

public class S0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     /* 1단계
	      * 1부터 100까지의 숫자 중에서 3의 배수만을 출력하세요(3의 배수 조건 :3으로 나눴을 때 나머지가 0)
	      * 2단계
	      * 1부터 100까지의 숫자 중에서 3의 배수 합을 출력하세요
	      * if(i%3==0)
	      */

	    int sum=0;
	   
	    System.out.println("1~100까지의 숫자 중에서 3의 배수만을 출력하세요");
	   
	     
	    for(int i=1 ; i <= 100 ;i++) {
	   	
	    	if(i%3==0) {
	   	     	System.out.println("3의 배수 :"+i);
	    
	   	     	
	   	     	sum+=i;
	   	     	

	   	     	
	   	     	
	   	     	
	
	   	     
	   	     
	   	     
	         
	 
	   	
	    	}
	
	    }
         
	    System.out.println(sum);
	
	
	

	
	}

}
