package second;

import java.util.Scanner;

public class If0430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * random () �޼ҵ�: �����߻� �޼ҵ�
		 * 0~9������ ���� �� �ϳ��� �߻���Ű��
		 * math,random() : 0.0���� ũ�ų� ���� 1.0���� ���� �Ǽ�
		 * �ֻ��� ��ȣ ��� ���α׷�
		 * 1~6 ������ ������ �߻����Ѽ�
		 * 1�̳����� 1���� ���Խ��ϴ�.
		 * 2�� ������ 2���� ���Խ��ϴ�.
		 */
		
          /*
           int randomNumber;
          randomNumber = (int)(Math.random()*10)+1;
          System.out.println(randomNumber);
         
          
          int randomNumber1;
          randomNumber1 = (int)(Math.random()*6);
          System.out.println(randomNumber1);
         
          if (randomNumber1==6) {
        	  System.out.println("6���� ���Խ��ϴ�");
          }
         else if(randomNumber1==5) {
        	 System.out.println("5���� ���Խ��ϴ�");
        	 }
         else if(randomNumber1==4) {
        	 System.out.println("4���� ���Խ��ϴ�");
        	 }
         else if(randomNumber1==3) {
        	 System.out.println("3���� ���Խ��ϴ�");
        	 }
         else if(randomNumber1==2) {
        	 System.out.println("2���� ���Խ��ϴ�");
        	 }
         else if(randomNumber1==1) {
        	 System.out.println("1���� ���Խ��ϴ�");
        	 }
  
         else {
        	 System.out.println("��"); 
        	 
      
         }
	     /*
	      * ��÷ if��           
	      * ���� ��� ���α׷�
	      * 1. 100���� �ʰ��ϴ� ���� �Է���
	      *  �Է� ������ �ʰ��Ͽ����ϴ� ���
	      * 2. ����ó��
	      * 95~100: ����� ������  A+�Դϴ�.
	      * 90~94: ����� ������ A�Դϴ�.
	      * 85~89: ����� ������B+�Դϴ�.
	      * 80~84: ����� ������ B�Դϴ�.
	      * ~~~~~
	      * 65~69:����� ������ D+�Դϴ�.
	      * 60~64:����� ������ D�Դϴ�.
	      * 60�̸�:����� ������ F�Դϴ�.
	      * print  ��¹��� �ѹ���  �� ��!
	      */ 
	      
          Scanner scan3= new Scanner(System.in);
          int goal=scan3.nextInt();         
          
          String inside;
          
          
          if(goal>100) {
        	  System.out.println("�Է� �ʰ� �Դϴ�.");
          }
          else {
        	  if(goal>=95 && goal<=100) {
        		  inside="A+";
	          }
	          else if(goal>90 && goal>=94) {
	        	  	inside="A";        	  	
	          }
	          else if(goal>85 && goal>=89) {
	        	  inside="B+";
	          }
	          else if (goal>80 && goal>=84) {
	        	  inside= "B";
	          }
	          else if (goal>75 && goal>=80) {
	        	  inside= "C+";
	          }
	          else if (goal>70 && goal>=74) {
	        	  inside= "C";
	          }
	          else {inside="F";}
        		  
               		  
         System.out.println(inside+"�����̴�");
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
          
	
	
         
	
          
     
          
          
          }  
          
          
	}
	
	
	}

