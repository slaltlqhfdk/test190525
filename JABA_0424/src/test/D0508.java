package test;

import java.util.Scanner;

public class D0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// ������ �ͷ��� ���� �� ��ü ���� ���
        	//1�б�   2�б�    
			//1�г� 1.8 2.5
			//2�г� 3.5 3.6
			//3�г� 4.1 4.2
   	 		// 4�г� 4.4 4.3
	    double sum=0;
	    double avg=0;
		double[][] grade = {
	    		{1.9,2.5}, {3.5,3.8},{4.1,4.2},{4.4,4.3}
	    };
			for(int i=0; i<grade.length; i++) {
			for(int j=0; j<grade[i].length; j++) {
				sum=sum+grade[i][j];  //i���� j���� �濡 ���� �������� �����Ѵ�
				avg=sum/(grade.length*grade[i].length);
			}//���� ��հ��� ���� ���� �࿡ �� grade�� ���� ��grade[i]�� ���� ��� ������ ���� 2�� ���� 4�̱⶧����
			}
				System.out.println("��հ�:"+ avg);
	
				Scanner scan=new Scanner(System.in);
	            int count=0;
				double chep=0;
				double chep1=0;
				String book;
		  String correct[][]= {{"����","chair"},
				  			   {"å��","table"},
				  			   {"��","water"},
				  			   {"����","pencil"},
				  			   {"�ð�","watch"}};
	        	for(int i=0; i<correct.length; i++){        		
	        		chep++;
	        		System.out.println(correct[i][1]+"�����ϱ��~?");
	        	book=scan.next();
	        	if(book.equals(correct[i][0])){ 
	        		System.out.println("����");
	        		count++;
	        	}
	        	else {
	        		
	        		System.out.println("��!");
                 	System.out.println(correct[i][0]);        	
	        	}	        	
	        	}
	        	
	        	
	        	//chep=count/correct.length*100;
				System.out.println((count/chep)*100);
				
				
				
	}

}
