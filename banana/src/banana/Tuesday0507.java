package banana;

import java.util.Scanner;

public class Tuesday0507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    
	         //���� 5���� �迭�� �Է¹޾Ƽ� ���� ū ���� ����ϼ���
		Scanner scan = new Scanner(System.in);
	                               

        int [] sorry = new int[5]; //���� �ټ����� �Է¹��� ���� 
        int max=0; // 
        for(int i=0; i<sorry.length;i++) { // 0~sorry.length(5)���� �ݺ��Ѵ�
			   System.out.println ("���ڸ� �Է��ϼ���"); //  ���ڸ� �Է��ϼ��� ���
			   sorry[i]=scan.nextInt(); // �Է¹��� ���ڸ� ��ĵ�Ѵ� 
			   	if(max<sorry[i])  // max������ �Է¹��� ���� ���Ͽ� �Է¹��� ���� �� Ŭ ��쿡 max�� ���Եȴ�
   			   		max=sorry[i]; //�Է¹��� ���� max�� �����Ѵ�
        
        
        
        }
	
	    System.out.println("���� ū ��:"+ max);  // �Է¹��� ���� ū���� ����Ѵ�
	    
	 
		Scanner scan2 = new Scanner(System.in);
	  
	         int[] start = new int[5];
	         int  min=0;
	
	
	
	
	
	
	
	
	}

}
