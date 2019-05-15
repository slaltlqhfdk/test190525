package second;

import java.util.Scanner;

public class Calculatormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Calculator 클래스에
		 * 정사각형,직사각형 넓이를 구하는 메소드를 각각
		 * 선언하고 
		 * CaluclatorMain 클래스에서 각각메소드를 호출
		 * 하여 계산된 넓이를 출력하세요.
		 * (각 변의 길이는 마음대로)
		 */
		int width;
		int height;
		
		
		Scanner scan =new Scanner(System.in);
		Calculator Gold1= new Calculator();
		//정사각형 넓이 계산 메소드 호출
		Gold1.Gold(5);
		//직사각형 넓이 계산 메소드 호출
		Gold1.Gold(5,10);
		
		System.out.println("직사각형 가로 길이:");
		width=scan.nextInt();
		System.out.println("직사각형  세로 길이:");
		height=scan.nextInt();
		
		//직사각형 넓이 계산 메소드 호출
		int area=Gold1.Gold(width,height);
		System.out.println("직사각형 넓이:"+area);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
