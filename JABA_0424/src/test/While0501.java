package test;

public class While0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//While문
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
	       
	     //while문을 이용하여 1부터 100까지의 합 구하기
	   
        int sum=0;	
	    int o=1;
	    while(o<=100 ) {
		    System.out.println(o); //o=1 이되어 밑으로 내려간다
		    sum=sum+o;   // sum=0, sum=0+ (o)=1    
		    o++;//o=뒤에 있는 ++떄문에 계속 증가하여 위로 올라가 반복된다.  
	    }	  
	    System.out.println(sum);
	    
	
	
	}

}
