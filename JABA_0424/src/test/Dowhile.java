package test;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	  /*
	   * Do~while��
	   * �⺻���� 
	   * do{
	   *          �ݺ����๮
	   *
	   *}   while(���ǽ�)
	    int i=1;
	    do  {
	    	System.out.println("i�� :"+i);
	    	
	    	
	     }while(i==2); */
		 //do while ����
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scanner= new Scanner(System.in);
		String inputString;
		
	       do {
	    	   System.out.print(">");
	    	   inputString = scanner.nextLine();
	    	   System.out.println(inputString);
	    	  } while (! inputString.equals("q"));
	       
	    	 System.out.println();
	    	 
	    	 System.out.println("���α׷� ����");
	    	 
	    	 
	    	 
	    	 
	    	 
	       
	       
		
		
		
		
		
		
	}
	

}
