package test;

public class E0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*형변환
		 *  1.자동형변환(promotion)
		 *       :크기가 작은 타입을 큰 타입으로 변환할 때
   		 *  2.강제형변환(casting)
		 *       :크기가 큰 타입을 작은 타입으로 변환할 때
		 *
		 */
		//자동 형 변환(byte(1)->int(4))
		byte bytevalue = 10;
        int intvalue = bytevalue;
        //자동형 변환(int(4)->double(8))
        double doublevalue=intvalue;
        
        int intvalue1= 10;
        byte bytevalue1= (byte) intvalue1;
		
        doublevalue =2.2222;
        System.out.println(doublevalue);
        intvalue= (int) doublevalue;
        System.out.println(intvalue);
        System.out.println(doublevalue);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
