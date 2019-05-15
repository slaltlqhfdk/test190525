package quizzz;

import java.util.Scanner;

public class Smile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int balance = 0; // 잔고 변수

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.예금| 2.출금 | 3.잔고| 4.종료");
			System.out.println("------------------------------");
			System.out.println("선택>");

			int check = scan.nextInt(); //check로  입력을 햇다

			if (check == 1) {
				System.out.print("예금액 :"); //예금액을  뜨게 저장을 한다
				int input = scan.nextInt(); // 예금액 인풋으로 정한다
				balance += input; // 인풋에 있는 금액이 발란스로 들어간다
				System.out.println("잔액 :" + balance);  // 발란스는 잔액이다 
 
			} else if (check == 2) {    
				System.out.print("출금액:"); 
				int output = scan.nextInt(); //아웃풋으로 선언을 했다
				if (balance < output) {  //잔액보다 출금액이 많으면 잔액부족이 뜨게 했다
					System.out.println("잔액부족");
				} else {

					balance -= output;  // 잔액에서 출금한다
					System.out.println("잔액:" + balance); 
				}
			} else if (check == 3) {    
				System.out.print("잔고:");   //나머지 잔고

				System.out.println("잔고액 :" + balance);
			} else {
				break;
			}
		}

	}

}
