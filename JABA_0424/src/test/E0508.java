package test;

public class E0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*����ȯ
		 *  1.�ڵ�����ȯ(promotion)
		 *       :ũ�Ⱑ ���� Ÿ���� ū Ÿ������ ��ȯ�� ��
   		 *  2.��������ȯ(casting)
		 *       :ũ�Ⱑ ū Ÿ���� ���� Ÿ������ ��ȯ�� ��
		 *
		 */
		//�ڵ� �� ��ȯ(byte(1)->int(4))
		byte bytevalue = 10;
        int intvalue = bytevalue;
        //�ڵ��� ��ȯ(int(4)->double(8))
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
