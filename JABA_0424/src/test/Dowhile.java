package test;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	  /*
	   * Do~while문
	   * 기본구조 
	   * do{
	   *          반복실행문
	   *
	   *}   while(조건식)
	    int i=1;
	    do  {
	    	System.out.println("i값 :"+i);
	    	
	    	
	     }while(i==2); */
		 //do while 예제
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner= new Scanner(System.in);
		String inputString;
		
	       do {
	    	   System.out.print(">");
	    	   inputString = scanner.nextLine();
	    	   System.out.println(inputString);
	    	  } while (! inputString.equals("q"));
	       
	    	 System.out.println();
	    	 
	    	 System.out.println("프로그램 종료");
	    	 
	    	 
	    	 
	    	 
	    	 
	       
	       
		
		
		
		
		
		
	}
	

}
