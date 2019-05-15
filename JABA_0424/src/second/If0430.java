package second;

import java.util.Scanner;

public class If0430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * random () 메소드: 난수발생 메소드
		 * 0~9사이의 숫자 중 하나를 발생시키려
		 * math,random() : 0.0보다 크거나 같고 1.0보다 작은 실수
		 * 주사위 번호 출력 프로그램
		 * 1~6 까지의 난수를 발생시켜서
		 * 1이나오면 1번이 나왔습니다.
		 * 2이 나오면 2번이 나왔습니다.
		 */
		
          /*
           int randomNumber;
          randomNumber = (int)(Math.random()*10)+1;
          System.out.println(randomNumber);
         
          
          int randomNumber1;
          randomNumber1 = (int)(Math.random()*6);
          System.out.println(randomNumber1);
         
          if (randomNumber1==6) {
        	  System.out.println("6번이 나왔습니다");
          }
         else if(randomNumber1==5) {
        	 System.out.println("5번이 나왔습니다");
        	 }
         else if(randomNumber1==4) {
        	 System.out.println("4번이 나왔습니다");
        	 }
         else if(randomNumber1==3) {
        	 System.out.println("3번이 나왔습니다");
        	 }
         else if(randomNumber1==2) {
        	 System.out.println("2번이 나왔습니다");
        	 }
         else if(randomNumber1==1) {
        	 System.out.println("1번이 나왔습니다");
        	 }
  
         else {
        	 System.out.println("꽝"); 
        	 
      
         }
	     /*
	      * 중첨 if문           
	      * 성적 출력 프로그램
	      * 1. 100점을 초과하는 점수 입력은
	      *  입력 범위를 초과하였습니다 출력
	      * 2. 학점처리
	      * 95~100: 당신의 학점은  A+입니다.
	      * 90~94: 당신의 학점은 A입니다.
	      * 85~89: 당신의 학점은B+입니다.
	      * 80~84: 당신의 학점은 B입니다.
	      * ~~~~~
	      * 65~69:당신의 학점은 D+입니다.
	      * 60~64:당신의 학점은 D입니다.
	      * 60미만:당신의 학점은 F입니다.
	      * print  출력문은 한번만  쓸 것!
	      */ 
	      
          Scanner scan3= new Scanner(System.in);
          int goal=scan3.nextInt();         
          
          String inside;
          
          
          if(goal>100) {
        	  System.out.println("입력 초과 입니다.");
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
        		  
               		  
         System.out.println(inside+"학점이다");
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
          
	
	
         
	
          
     
          
          
          }  
          
          
	}
	
	
	}

