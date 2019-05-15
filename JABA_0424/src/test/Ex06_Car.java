package test;

public class Ex06_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 생성자를 이용한 car라는 이름의 객체선언
		Ex05_Car car=new Ex05_Car();
		//매개변수가 string,color,int,cc를 이용한
		//car2라는 이름의 객체 선언
		Ex05_Car car2 =new Ex05_Car("검정",3000);
		
		System.out.println(car2.ccfield);
		System.out.println(car2.colorfield);
		System.out.println(car.ccfield);
		System.out.println(car.colorfield);
	
	
	
	
	
	
	
	
	
	
	
	}

}
