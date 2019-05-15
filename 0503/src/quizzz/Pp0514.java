package quizzz;

import java.util.Scanner;

public class Pp0514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//스캐너 선언
		  	Scanner scan=new Scanner(System.in);
			//객체 선언
		  	P0514 login=new P0514();
		  	boolean run = true;
	
		    while(run) {
		    	System.out.println("------------");
		    	System.out.println("수행할 서비스를 선택해주세요");
		    	System.out.println("1.로그인|2.로그아웃|3.종료");
		    	System.out.println(">>");
		    	int choice=scan.nextInt();
		    	switch(choice) {
		    	case 1:
		    		//id,pw 입력받아서
		    		//로그인 처리용 메소드 호출
		    	System.out.println("아이디를 입력하세요:");
		    	String id=scan.next();
		    	System.out.println("비밀번호를 입력하세요");
		    	String PW=scan.next();
		    	//객체에 있는 로그인 처리용 메소드 호출
		    	login.login1(id,PW);
		    	
		    	
		    	
		    	}
		    
		    
		    }
	
	
	
	
	}

}
