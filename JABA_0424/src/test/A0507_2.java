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
 			   System.out.println ("���ڸ� �Է��ϼ���"); //  
 			   num[k]=scan.nextInt(); //
        }
 			   for(int i=0; i<num.length;i++) { 
 				   for(int j=i+1;j<num.length; j++) {
 					   if (num[i]<num[j]) {
					 //num[i]�� ������ �ִ� ���� temp�� ����
 						   temp=num[i]; //  ������0�̰� num[4] �̸� ������ �����ʿ��� �������� ���Ե� ���� ���ʰ��� ���Եȴ�.
 						   num[i]=num[j]; //  j�� 5�̰� i�� 4�̸�  i�� 5�� �ȴ�.
 						   num[j]=temp; //  ������ 5�̰� ���̴�6�̴ϱ� ���̴� 5���ȴ�.
 					   }	   
 				   }
 			   }
        
			
			 
        for(int n=0;n<num.length;n++){    //System.out.println(num[0]);
			 System.out.println(num[n]);	//System.out.println(num[1~4]);
			 
	}
}
}
