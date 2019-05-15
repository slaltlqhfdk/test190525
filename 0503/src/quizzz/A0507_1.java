package quizzz;

import java.util.Scanner;

public class A0507_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String [] name = {"원휘형", "윤교형","호민이","현태형"};
		 * 
		 * System.out.println("이름 :"+name[0]); System.out.println("이름:"+name[1]);
		 * System.out.println("이름:"+name[2]); System.out.println("이름:"+name[3]);
		 * //length 배열 크기를 반환(Return) for(int i = 0; i<name.length; i++) { //반복 변수를 사용해서
		 * 저 4개 를 함축적으로 사용! System.out.println(name[i]); // 1<4개보다 작아야 하니깐
		 * (name.length=배열 크기)
		 */

		/*
		 * 배열 선언시 값은 주지 않고 배열 크기만 선언
		 * 
		 */
		// 크기가 3이고 numbers라는 배열 변수 선언
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// 크키가 3인 double, string 배열 변수 선언해보기
		double[] doublenumber = new double[3];
		for (int i = 0; i < doublenumber.length; i++) {
			System.out.println(doublenumber[1]);
		}

		// numbers에 값 저장하기 (doubleNumbers[0]=0.0;으로 )
		numbers[0] = 1; // (string[0] ="변수 값";)
		numbers[1] = 2;
		numbers[2] = 3;
		for (int i = 0; i < numbers.length; i++) { // length안에 포함되는 숫자가 밑에
			System.out.println(numbers[i]);
		}

		/*
		 * 1. 크기가 3인 정수형 배열 선언 
		 * 2. 스캐너를 이용하여 값을 3개 입력 
		 * 3. 입력된 값의 총합,평균 계산
		 */
		Scanner scan = new Scanner(System.in);
		int[] number = new int[3]; // 비어있는 크기의 변수를 선언
		int sum = 0; // 총합 변수
		int avg = 0; // 평균 변수
		System.out.println("첫번 째 값:"); // 첫번 째 값을 입력받기 위해 스캔으로 입력받음
		number[0] = scan.nextInt();
		System.out.println("두번 째 값:"); // 두번 째 값을 입력받기 위해 스캔으로 입력받음
		number[1] = scan.nextInt();
		System.out.println("세번 째 값:"); // 세번 째 값을 입력받기 위해 스캔으로 입력받음
		number[2] = scan.nextInt();
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i]; // 위에 반복을 하여 number[0], [1], [2] 값을 더 한다

		}
		avg = sum / number.length; // 넘버나누기 총합은 평균값!
		System.out.println("평균 값:" + avg);

	
	}
	
	
	

}
