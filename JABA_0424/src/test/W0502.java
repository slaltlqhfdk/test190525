package test;

import java.util.Scanner;

public class W0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//������ �ϳ� �Է¹޾� 1���� �Է��� ���ڱ���		      ������ Ǯ��� 1:���� �Է¹ޱ� (Scanner ���)													  
		    //2�� ��� 3�� �����  ������ ���� ���� ���ϱ�	 2:1���� �Է��� ���ڱ��� ������ ����  for�� ��� 
														// 3: ���� �߿��� 2�� ���, 3�� ��� �ɷ����� (����)-if
			Scanner scan=new Scanner(System.in);		//3.1: 2�ǹ�� 3�� ��� �ɷ��� �����? �������� 0�� ��
                                                          // 4: �ɸ��� �� ������ �� ���ϱ� (������)
			  int sum =0;                                 
		      System.out.print("���� �Է�:");
		      int num=scan.nextInt();
		      for(int i=1; i <=num; i++) {  //num�� ���ڸ� �־� 2�� ����� 3����� �Ǵ°��� �ɷ�����
		          
		      //��������  ������ �ȴ� �׷��� 1+5+7+13
		    	  if(i%2!=0 && i%3!=0) {
		
		    	  sum+=i;
	
		    	  } 
		    	  
		
		
		      }
		      System.out.println(sum);
	    	  
	}
	
	
	
	
	}


