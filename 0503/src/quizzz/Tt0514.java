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
	  System.out.println("\n���ϴ� �޴��� ����");
	  System.out.println("1.����|2.���|3.�ܾ�Ȯ��|4.����");
	  System.out.println(">");
	  
	  int menu=scan.nextInt();
	  return menu;
  }  
  	public int money_input(int money) {
  	  System.out.println("\n���� �޴��Դϴ�");
  	  System.out.println("�Ա��� �ݾ��� �Է��ϼ���:");
  	  int input_money=scan.nextInt();
  
  	  money=money+input_money;
  	  return money;
  	
  	}
  
  	public int money_output(int money) {
    	  System.out.println("\n��� �޴��Դϴ�");
    	  System.out.println("�Ա��� �ݾ��� �Է��ϼ���:");
    	  int input_money=scan.nextInt();
  
  	if(money<=input_money) {// ��ݾ׺��� �ܾ��� ũ�ų� ������ 
  		System.out.println("�ݾ��� �����մϴ�");
  	}
  	
  	else {
  		money=money-input_money;
  		//�����ִ� �ܾ� ���� ��ݾ��� �ܰ� �ȴ� 
  	}
  	return money;
  	}
  


}



