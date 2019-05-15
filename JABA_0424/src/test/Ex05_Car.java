package test;

public class Ex05_Car {

   /*클래스의 3요소
    * 1.필드 (field)
    *   =>데이터를 저장하는 공간
    * 2.생성자(constructor)
    *  =>객체 생성을 도와주는 블록
    *  =>객체 생성시 필요한 매개변수를 규정함.
    *  =>매개변수가 있을수도 없을수도 있다.
    *  =>매개변수가 없으면 :기본 생성자
    *  =>생성자의 이름은 클래스 이름과 동일함
    *  3.메소드(method)
    *  => 특정 기능을 정의한 블록
    *  =>매게 변수가 있을수도 없을수도 있다.
    *  =>메소드가 호출되면 자신이 가지고 있는 기능을 수행함.    
    *  =>기능 수행이 끝나면 리턴 값이 존재한다.
    *  
	*/
      //필드선언
	String colorfield;
	int ccfield;
	
	//기본 생성자
	Ex05_Car(){
		
		
	}
     //매개변수가 있는 생성자 선언
	Ex05_Car(String color, int cc){
			colorfield =color;
			ccfield=cc;
	}
 




}
