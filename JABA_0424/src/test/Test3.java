package test;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �� ������ ���� ����� boolean Ÿ�� (true,false) 
		 * >,<,>=,<= 
		 * ==:�纯�� ������ �Ǵ�, ���ٸ� true �ٸ��ٸ� false 
		 * !=:�纯�� �ٸ��� �Ǵ�, ���ٸ� false �ٸ��ٸ� true
		 * 
		 * 
		 *
		 */

		
		int go = 10;
		int no = 3;
		System.out.println(go < no);
		System.out.println(go >= no);
		System.out.println("go<no�� ������" + (go < no));
		System.out.println("go>=no�� ������" + (go >= no));
        int we=38;
        int fwe=79;
        System.out.println(we>=fwe);
        System.out.println(fwe<=we);
        System.out.println("we>=fwe�� ������"+(we>=fwe));
        System.out.println("fwe<=we�� ������");
        

	    
        boolean result;       //(�ٸ� ���)
        
        int num3=3;
        double num4=3.0;
        result=num3==num4;
        System.out.println(result);
        
        
        
        
        /*
         *  ���� ������ ����
         * +=, -=, *=, /=, &=       (skil+= skil+pool)
         * a +=b => a= a+b 
         * ����
         * 
         *num1=5;
         * num2=3;
         * num1-=num2  (num1(5)-=num1(5)-num2(3) ����:3)
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
 		
 		//AND ����
 		boolean boolResult = true;   // AND: Ʈ���� ���� Ʈ��, || : Ʈ�簡 ������ ������ Ʈ��!
 		boolResult = true&&true;
 		System.out.println("AND ����:"+boolResult);
 		
 		
 		boolResult=true&&false;
 		System.out.println("AND ����:"+boolResult);
 		
 		boolean boolResult1 = true;
 		boolResult1 =true||true;
 		System.out.println("|| ����"+boolResult);
 		
 		boolResult=true||false;
 		System.out.println("|| ����"+boolResult);
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
         
         
        		
         
        
        
	
	
	
	
	}
	

}
