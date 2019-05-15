import java.util.Scanner;

public class _0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 상황 연산자
		 * 형식:
         * (조건식) ? 조건이 true 일때 결과: false 일때 결과         
		 */
		 int score =80;
		 String grade;
		 //삼황 연산자 사용
		 grade=(score > 90)? "A" : "B";
		 /*
		  * score가 90 보다 크면
		  * grade="A"
		  * score가 90보다 작으면 
		  * grade="B"로 처리
		  */
		System.out.println("grade 변수 값:" +grade);		
		
		int score1=600;
		String vella;
		vella=(score1<600)? "A" :"B";
 		System.out.println("vella 변수 값:"+score1);
 		
		/*
		 *증감 연산자
		 *형식:++,--
		 *변수 앞에 ++을 쓰면 변수가 가지고 있는 값에 
		 *1을 증가신킨 뒤 연산에 사용함,
		 *변수 뒤에 ++를 쓰면 변수가 가지고 잇는 값을 
		 *일단 연산에 사용한 뒤 변수 값을 1 증가시킴. 
		 */
		 int x =10;   //z=x++ (x값을 계산하고 나중에 대입), z=++x (x값을 1더하고 대입)
		 int y =10;       
		 int z;
		 System.out.println(x);
		 x++;
		 System.out.println(x);
		 
         
		
		 //스캐너를 사용하기 위한 선언
		 Scanner scan = new Scanner(System.in);
		 String name;
		 System.out.print("이름을 입력하세요:");
		 name=scan.next();
		 System.out.println("입력한 이름은"+name+"입니다.");
		
		 
		 
		 /*
		  * 문자입력:next()
		  * 정수입력:nextInt()
		  * 실수입력:nextDouble()
		  * 
		  */
		 int age;
		 System.out.print("나이를 입력하세요:");
		 age=scan.nextInt();
		 

		 
		
		 
		 String home;
		 System.out.print("주소를 입력하세요:");
		 
		 home=scan.next();
		 System.out.println("입력한 나이는 "+home+"입니다.");
		 scan.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
