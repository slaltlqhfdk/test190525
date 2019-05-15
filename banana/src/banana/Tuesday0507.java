package banana;

import java.util.Scanner;

public class Tuesday0507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    
	         //정수 5개를 배열에 입력받아서 가장 큰 수를 출력하세요
		Scanner scan = new Scanner(System.in);
	                               

        int [] sorry = new int[5]; //정수 다섯개를 입력받을 변수 
        int max=0; // 
        for(int i=0; i<sorry.length;i++) { // 0~sorry.length(5)까지 반복한다
			   System.out.println ("숫자를 입력하세요"); //  숫자를 입력하세요 출력
			   sorry[i]=scan.nextInt(); // 입력받은 숫자를 스캔한다 
			   	if(max<sorry[i])  // max변수와 입력받을 수를 비교하여 입력받은 수가 더 클 경우에 max에 대입된다
   			   		max=sorry[i]; //입력받은 수를 max에 대입한당
        
        
        
        }
	
	    System.out.println("가장 큰 수:"+ max);  // 입력받은 가장 큰수를 출력한다
	    
	 
		Scanner scan2 = new Scanner(System.in);
	  
	         int[] start = new int[5];
	         int  min=0;
	
	
	
	
	
	
	
	
	}

}
