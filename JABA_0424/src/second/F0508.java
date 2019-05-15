package second;

import java.util.Scanner;

public class F0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 동전 갯수 구하기
		// 예)2680을 입력하면 500원 5개 100원6개 50원1개10원3개

		Scanner scan = new Scanner(System.in);
		int[] couque = { 500, 100, 50, 10, 1};//500원 100원 50원 10원 1원 을 나누기위해 인트에 변수를 선언하고 넣었다
		int money = scan.nextInt(); //금액을 적기위한 변수선언 후 스캔

		System.out.println("money=" + money); //내가적은금액을 프린트

		for (int i = 0; i < couque.length; i++) {//

			System.out.println(couque[i] + "원" + money / couque[i]);// 쿠크는위에 돈이 순차적으로 나오는 거고//2680/500=몫:5 
			// 그 뒤에는  (money)를 쿠크 500.,100,50,하나씩 나누어 나오는 값이 500원 100원 50원 에 갯수가 나온다
			money %= couque[i];//2680%500=180

		}

	}

}
