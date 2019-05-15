package today;

import java.util.Scanner;

public class SCHOOL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Scanner scan = new Scanner(System.in);
	    int light=0;
	    int count=0;
	    int good=0;
	   
	    good=(int) (Math.random()*100)+1;  //1부터100까지의 랜덤변수를 light를 대입    
	     
	    
	    do {  System.out.print("1과 100사이의 값을 입력하세요:");
	    light=scan.nextInt(); //스캔을 라이트에 대입을 하였다 
	    	if(light>good) {  //라이트가 굿보다 크면 작은값을 입력하세요 라는 뜼
	    		System.out.println("작은 값을 입력하세요");
	    	}       //light는 컴퓨터가 지정한 값
	    	else if(light<good) { //라이트가 굿보다 작으면 큰값을 입력하세요 
	    		System.out.println("큰 값을 입력하세요");
	    	}
	    	else 	{System.out.println("정답");
	           
 	        }
	         count++;
	    }while (good!=light); //굿이 라이트의 값이랑 다르면 계속 반복된다
	     System.out.println(count);
	
	
	
	    
	    
	
	
	}

}
