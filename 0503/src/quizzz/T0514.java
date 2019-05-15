package quizzz;

import java.util.Scanner;

public class T0514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 간단한 은행 프로그램 
		 * 1. 새로운 고객을 등록할때 이름,계좌번호,초기입금액을 입력함.
		 * ->고객 등록 방법은 2가지 방법으로 구현
		 *  1.1 객체 생성시 매개변수로 전달하기
		 *  1.2 getter,setter 이용하기
		 * 2. 예금 기능을 수행할 수 있다.
		 * 3. 출금 가능을 수행할 수 있다.
		 *  3.1 잔액이 0원미만으로 되면 출금 불가능
		 *  4. 잔액 확인 기능을 수행할 수 있다.
		 */
		Scanner scan=new Scanner(System.in);
	int menu=0,bank_num=0,fr_money=0;
    String name=null;
    
	System.out.println("안녕하세요.고객등록 진행 후 메뉴를 선택해라");
		
	System.out.println("새로 등록할 고객의 이름을 작성하세요:");
	name=scan.next();//이름 입력 스캔을 입력 받고
	System.out.println(name+"님의 계좌번호:");
	bank_num=scan.nextInt();//계좌번호 입력을스캔받고
	System.out.println(name+"님의 첫 입금할 금액:");
	fr_money=scan.nextInt();//입금할 금액을 입력 스캔을 받고
	
	Tt0514 mybank=new Tt0514(name,bank_num,fr_money);//클래스와 연결문
	System.out.println("\n"+name+"님의 계좌 등록이 완료.");
	
	do {
		menu=mybank.menu_choice();//메뉴 초이스 메소드를 불러온다

		switch(menu){
			case 1:fr_money=mybank.money_input(fr_money);break;
			// mybank.money_input(fr_money)문장은 입금을 입력하기위한 문장  
			case 2:fr_money=mybank.money_output(fr_money);break;
			//mybank.money_output(fr_money)문장은 출금을 입력하기위한 문장
 			case 3:System.out.println("현재잔액:"+fr_money);break;
			//
			case 4:System.out.println("프로그램을 종료.");break;
			//
			default:System.out.println("잘못된 입력.");break;
			//1,2,3,4가 아니면 잘못된 입력이 나오게 된다.		
		 }
		}while(menu!=4); // 4를 치면 반복문이 종료
		System.out.println("이용해주셔서 감사");
	//while문이 종료되기 위해선 ()안의 값이 false가 나와야한다.
	
	
	
	}
}
