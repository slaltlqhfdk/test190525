package test;

public class While0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//While��
		/*int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;			
		}*/
		
	    /*int w=1;
	    while(w<=10) {
	       System.out.println(w);
	       w=w+2;
	       */
	       
	     //while���� �̿��Ͽ� 1���� 100������ �� ���ϱ�
	   
        int sum=0;	
	    int o=1;
	    while(o<=100 ) {
		    System.out.println(o); //o=1 �̵Ǿ� ������ ��������
		    sum=sum+o;   // sum=0, sum=0+ (o)=1    
		    o++;//o=�ڿ� �ִ� ++������ ��� �����Ͽ� ���� �ö� �ݺ��ȴ�.  
	    }	  
	    System.out.println(sum);
	    
	
	
	}

}
