package quizzz;

public class Aa0513 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static �ʵ� ���
		//��ü ������ �ƴ� Ŭ������ ���� ����   
	    System.out.println(A0513.pi);
	   A0513 cal=new A0513();
	    System.out.println(cal.pi);
	    //static �޼ҵ� ���
	    A0513.plus(10,20);
	    //��� ���
	    System.out.println(A0513.EARTH_RADIUS);

  
	    //����� �̿��Ͽ� ���� ���� ���ϱ�
	    double earthArea=A0513.EARTH_RADIUS*
	    		A0513.EARTH_RADIUS*Math.PI;
	    System.out.println("��������:"+earthArea);	
	
	
	
	
	
	}
}