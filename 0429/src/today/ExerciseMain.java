package today;

import java.util.Scanner;

public class ExerciseMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /* 학생의 이름, 국어, 영어 점수를 입력받아
    * 평균 점수가 70점이상이면 합격
    * 70점 미만이면 불합격을 출력하는 프로그램을 작성하시오.
    * 
    * 이름,국어 영어 점수를 필드값으로 지정하는 방법은 총 2가지로 해서 구현
    * 1.생성자를 활용하기
    * 2. get,set 메소드 활용하기
    * 합격 불합격은 result라는 메소를 사용하도록!
    */
	 //1.번 방법 이용해서 구현
//		Scanner scan =new Scanner(System.in);
//		System.out.println("이름");
//		String name = scan.next();
//		System.out.println("국어점수");
//		int koreanScore =scan.nextInt();
//		System.out.println("영어점수");
//		int englishScore =scan.nextInt();
		
		Exercise stu= new Exercise();
		stu.setName("호민");
		System.out.println(stu.getName());
		stu.result();
		System.out.println("1번 방법 끝.");
	
	
		 
		 
		 
		 
		 
		 
		 
	}

}



