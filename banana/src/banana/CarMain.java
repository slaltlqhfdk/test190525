package banana;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//car 클래스에 대한 객체 생성
		 
		//객체 추가 선언
		Car car2 =new Car();
		
		
		
		
		
		
		
		//car 클래스에 선언한 필드값 사용
		//객체이름,필드명
		Car car =new Car();
		System.out.println(car.color);
		System.out.println(car.company);
		System.out.println(car.maxspeed);
		System.out.println(car.model);
		System.out.println(car.speed);   
	

		//필드값 변경
		car.speed = 100;
		System.out.println(car.speed);
		//car2의 speed 필드값 확인
		System.out.println(car2.speed);
	
			
	}
	
	
		
	
	
	
	}


