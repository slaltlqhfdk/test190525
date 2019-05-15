package test;

import java.util.Scanner;

public class F0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 크기를 유동적으로 설정하기
		Scanner scan = new Scanner(System.in);
		int[] num;
		System.out.print("지정하고 싶은 배열크기 입력");
		int size = scan.nextInt();
		num = new int[size];
		System.out.println("num 배열 크기" + num.length);

		
		
		
		int[] ajax=null;
		boolean run = true;
		int max=0;
		int sum=0;
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.학생수| 2.점수입력| 3.점수리스트| 4.분석|5.종료");
			System.out.println("------------------------------");
			System.out.println("선택>");
			
			int check = scan.nextInt();
			
			if (check == 1) {//학생수를 입력받아 배열크기를 지정
				System.out.print("학생 수>");//1.학생수 입력받음.
				int student = scan.nextInt();
				ajax = new int[student];//2.입력받은 수 만큼 배열크기를 지정함.
										//->배열크기 지정하는 방범?
			}
			else if (check==2) {//배열의 크기만큼 학생들의 점수를 각각 입력
				 for(int i=0; i<ajax.length; i++){//1.배열에 점수를 입력하기.
			       System.out.println((i+1)+"번 째 학생 점수:");//2.입력을 하나하나 할것이냐,반복문을 쓸것이냐
			       ajax[i]=scan.nextInt();//반복문을 쓴다면for문을 이용.(배열의 값을 정수에 대입)
				
				 }
			}
				
			
			else if (check==3) {//입력된 학생들의 점수출력
					 for(int i=0; i<ajax.length;i++) {//1.배열에 입력된 값을 모두 출력
						 System.out.println(((i+1)+"번 째 학생 점수:"+ajax[i]));//2.출력하기 위해 print tkdyd
					 }//3.배열의 모든 요소를 사용해야 하니 반복문 사용
			}
				 
					 
			else if(check==4) {//입력된 값중 최대값, 평균 값 출력
						 for(int i=0; i<ajax.length; i++) {//최대값 출력
						 if(max<ajax[i]) {//1.1최대 값 출력을 위한 변수
						 max=ajax[i];//1,2,최댓값을 찾는 방법??
						 sum=sum+ajax[i];} //=>비교문을 이용??
					 }
						 
						 System.out.println("최대값"+max+"평균 값 "+((double)sum/ajax.length));
					 	/*
					 	 * 2. 평균값 출력
					 	 * 2.1평균을 구하기 위해서는 합계 값이 필요
					 	 * 2.2 합계값을 어떻게??
					 	 * 2.3 평균 값 출력을 위해 변수를 선언??
					 	 */
			
				 
			}
				
				 
		}
	}
}


				 
				 
				 
			
