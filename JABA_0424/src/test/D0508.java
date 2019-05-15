package test;

import java.util.Scanner;

public class D0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// 학점이 와래와 같을 때 전체 평점 계산
        	//1학기   2학기    
			//1학년 1.8 2.5
			//2학년 3.5 3.6
			//3학년 4.1 4.2
   	 		// 4학년 4.4 4.3
	    double sum=0;
	    double avg=0;
		double[][] grade = {
	    		{1.9,2.5}, {3.5,3.8},{4.1,4.2},{4.4,4.3}
	    };
			for(int i=0; i<grade.length; i++) {
			for(int j=0; j<grade[i].length; j++) {
				sum=sum+grade[i][j];  //i값과 j값을 썸에 더해 왼쪽으로 대입한다
				avg=sum/(grade.length*grade[i].length);
			}//그후 평균값을 내기 위해 행에 값 grade와 열에 값grade[i]를 곱해 썸과 나눈다 행이 2고 열이 4이기때문에
			}
				System.out.println("평균값:"+ avg);
	
				Scanner scan=new Scanner(System.in);
	            int count=0;
				double chep=0;
				double chep1=0;
				String book;
		  String correct[][]= {{"의자","chair"},
				  			   {"책상","table"},
				  			   {"물","water"},
				  			   {"연필","pencil"},
				  			   {"시계","watch"}};
	        	for(int i=0; i<correct.length; i++){        		
	        		chep++;
	        		System.out.println(correct[i][1]+"무엇일까요~?");
	        	book=scan.next();
	        	if(book.equals(correct[i][0])){ 
	        		System.out.println("정답");
	        		count++;
	        	}
	        	else {
	        		
	        		System.out.println("땡!");
                 	System.out.println(correct[i][0]);        	
	        	}	        	
	        	}
	        	
	        	
	        	//chep=count/correct.length*100;
				System.out.println((count/chep)*100);
				
				
				
	}

}
