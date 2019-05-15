package test;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 비교 연산자 연산 결과는 boolean 타입 (true,false) 
		 * >,<,>=,<= 
		 * ==:양변이 같은지 판단, 같다면 true 다르다면 false 
		 * !=:양변이 다른지 판단, 같다면 false 다르다면 true
		 * 
		 * 
		 *
		 */

		
		int go = 10;
		int no = 3;
		System.out.println(go < no);
		System.out.println(go >= no);
		System.out.println("go<no의 연산결과" + (go < no));
		System.out.println("go>=no의 연산결과" + (go >= no));
        int we=38;
        int fwe=79;
        System.out.println(we>=fwe);
        System.out.println(fwe<=we);
        System.out.println("we>=fwe의 연산결과"+(we>=fwe));
        System.out.println("fwe<=we의 연산결과");
        

	    
        boolean result;       //(다른 방식)
        
        int num3=3;
        double num4=3.0;
        result=num3==num4;
        System.out.println(result);
        
        
        
        
        /*
         *  대입 연산자 예제
         * +=, -=, *=, /=, &=       (skil+= skil+pool)
         * a +=b => a= a+b 
         * 예시
         * 
         *num1=5;
         * num2=3;
         * num1-=num2  (num1(5)-=num1(5)-num2(3) 답은:3)
         */
        int skil=3;
        int pool=2;
        skil*=pool;
        //skil = skil* pool
        
        
        
        
        
 		boolean value1 =true;
 		System.out.println(value1);
 	
 		
 		value1 = !value1;
 		System.out.println(value1);
 		
 		value1 = !value1;
 		System.out.println(value1);
 		
 		//AND 연산
 		boolean boolResult = true;   // AND: 트루일 때만 트루, || : 트루가 있으면 무조건 트루!
 		boolResult = true&&true;
 		System.out.println("AND 연산:"+boolResult);
 		
 		
 		boolResult=true&&false;
 		System.out.println("AND 연산:"+boolResult);
 		
 		boolean boolResult1 = true;
 		boolResult1 =true||true;
 		System.out.println("|| 연산"+boolResult);
 		
 		boolResult=true||false;
 		System.out.println("|| 연산"+boolResult);
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
         
         
        		
         
        
        
	
	
	
	
	}
	

}
