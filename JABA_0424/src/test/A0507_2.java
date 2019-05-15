package test;

import java.util.Scanner;

public class A0507_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		  
         //int[] = {5,1,2,4,3,};
        int  temp;
        int [] num= new int[5];
        for(int k=0;k<num.length;k++) { // 
 			   System.out.println ("숫자를 입력하세요"); //  
 			   num[k]=scan.nextInt(); //
        }
 			   for(int i=0; i<num.length;i++) { 
 				   for(int j=i+1;j<num.length; j++) {
 					   if (num[i]<num[j]) {
					 //num[i]가 가지고 있는 값을 temp에 대입
 						   temp=num[i]; //  템프가0이고 num[4] 이면 무조건 오른쪽에서 왼쪽으로 대입된 값을 왼쪽값에 대입된다.
 						   num[i]=num[j]; //  j가 5이고 i가 4이면  i는 5가 된다.
 						   num[j]=temp; //  템프는 5이고 제이는6이니깐 제이는 5가된다.
 					   }	   
 				   }
 			   }
        
			
			 
        for(int n=0;n<num.length;n++){    //System.out.println(num[0]);
			 System.out.println(num[n]);	//System.out.println(num[1~4]);
			 
	}
}
}
