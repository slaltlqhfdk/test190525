package test;

import java.util.Scanner;

public class W0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//정수를 하나 입력받아 1부터 입력한 숫자까지		      문제를 풀어보면 1:숫자 입력받기 (Scanner 사용)													  
		    //2의 배수 3의 배수를  제외한 수의 총합 구하기	 2:1부터 입력한 숫자까지 순차적 접근  for문 사용 
														// 3: 숫자 중에서 2의 배수, 3의 배수 걸러내기 (조건)-if
			Scanner scan=new Scanner(System.in);		//3.1: 2의배수 3의 배수 걸러낼 방법은? 나머지가 0인 값
                                                          // 4: 걸리낸 후 숫자의 합 구하기 (누적값)
			  int sum =0;                                 
		      System.out.print("숫자 입력:");
		      int num=scan.nextInt();
		      for(int i=1; i <=num; i++) {  //num의 숫자를 넣어 2의 배수와 3배수가 되는것은 걸러지고
		          
		      //남은값은  나오게 된다 그래서 1+5+7+13
		    	  if(i%2!=0 && i%3!=0) {
		
		    	  sum+=i;
	
		    	  } 
		    	  
		
		
		      }
		      System.out.println(sum);
	    	  
	}
	
	
	
	
	}


