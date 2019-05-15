package quizzz;

import java.util.Scanner;

public class Tt0514 {
	Scanner scan=new Scanner(System.in);

	    private String name;
		private int bank_num;
		private int money;
		

  Tt0514(String name,int bank_num,int money){
	  this.name =name;
	  this.bank_num=bank_num;
	  this.money=money;
	  }

  public int menu_choice() {
	  System.out.println("\n원하는 메뉴를 선택");
	  System.out.println("1.예금|2.출금|3.잔액확인|4.종료");
	  System.out.println(">");
	  
	  int menu=scan.nextInt();
	  return menu;
  }  
  	public int money_input(int money) {
  	  System.out.println("\n예금 메뉴입니다");
  	  System.out.println("입금할 금액을 입력하세요:");
  	  int input_money=scan.nextInt();
  
  	  money=money+input_money;
  	  return money;
  	
  	}
  
  	public int money_output(int money) {
    	  System.out.println("\n출금 메뉴입니다");
    	  System.out.println("입금할 금액을 입력하세요:");
    	  int input_money=scan.nextInt();
  
  	if(money<=input_money) {// 출금액보다 잔액이 크거나 같을때 
  		System.out.println("금액이 부족합니다");
  	}
  	
  	else {
  		money=money-input_money;
  		//남아있는 잔액 빼기 출금액이 잔고가 된다 
  	}
  	return money;
  	}
  


}



