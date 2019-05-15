package quizzz;

public class Aa0513 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static 필드 사용
		//객체 접근이 아닌 클래스로 직접 접근   
	    System.out.println(A0513.pi);
	   A0513 cal=new A0513();
	    System.out.println(cal.pi);
	    //static 메소드 사용
	    A0513.plus(10,20);
	    //상수 사용
	    System.out.println(A0513.EARTH_RADIUS);

  
	    //상수를 이용하여 지구 넓이 구하기
	    double earthArea=A0513.EARTH_RADIUS*
	    		A0513.EARTH_RADIUS*Math.PI;
	    System.out.println("지구넓이:"+earthArea);	
	
	
	
	
	
	}
}