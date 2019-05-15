package test;

public class While0501_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 /*
	  * 
	  * 
	  */
     //주사위를 던져서 6이 나오면 반복문 종료
		/*boolean value=true ;   // boolean 타입의 value로 변수선언
		 while (value) {  //
			int num =(int) (Math.random()*6)+1;   // 1~6까지의 숫자가 나와서 num에 대입된다
			System.out.println("숫자: "+num);  //     num의 값이 그대로 밑으로 출력이 된다
			if(num==6) {    //num6이 나오면 종료
		       value=false;   value가 if조건부에 맞을때 까지 반복을 한다
		       
		       
			
		       
		       System.out.println("반복문 종료됨.");*/
			
		
                        
		 
		 //주사위를 던져서 합이 5 나오면 반복문 종료
		 
		 /* int sum=0;      //
		 boolean kind=true ;  
		 while (kind) {
			int num =(int) (Math.random()*6)+1;      1~6까지 중의 숫자중 하나가 나와서 num에 들어간다 
			System.out.print("("+num);             
			int num1 =(int) (Math.random()*6)+1;     1~6까지 중의 숫자중 하나가 나와서 num1에 들어간다
			
			System.out.println(","+num1+")"); 		
			sum=num+num1;  //  num.num1두개가 나와서 더해 5가 나올때 까지 계속 숫자가 변한다
			
			if(sum==5) {   //SUM이 5 나오면 종료된다 
 				
 				System.out.println("반복문 종료됨.");
			
			kind=false;*/
		 
		 	
					int i=0;
					int j=0;
		for(i =1; i<=5; i++) {     //i=5보다 작거나 같아야 한다
			  
			  for( j=1; j<=i; j++) {    //j=0 고정 값이고 i=0~5까지 차례대로 돌아서  갯수가 생긴다 
				System.out.print("*");   // 별이라는 숫자를 정함 				
				
				
		
		 }
			  System.out.println("");
		 }
		
		
		
		 
		
		
		for(i=1;i<=15;i++) {
			System.out.println("안녕하세요");
		}
		
		
		
	}
	
	}

 			
 		


