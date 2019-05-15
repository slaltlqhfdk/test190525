package banana;

public class Ex05_C {
      //A클래스 타입의 변수 a 선언
	  // Ex05_A a;	
	  //B클래스 타입의 변수 b 선언
      //Ex_Ab a;

      ExO5_C(){
    		// A클래스 타입의 변수 선언 a 선언
    		//	Ex05_A a;
    	    // A클래스에 대한 객체 생성
    	    Exo5_A a =new Exo5_A();
    	    //객체를 통한 A 클래스의 필드 및 생성자 접근해보기 
    	    //필드 접근
    	    a.field1 = 10;
    	    a.field2 = 20;
    	    a.field3 = 30;  //Exo5_A에서 세번재는 private이기 떄문에 여기서 되지 않는다(자신이 아닌 클라스에 접근 불가능)
    	    //메소드 호출 
    	    a.method1();
    		a.method2();
    		a.method3();  


    		}


}




















