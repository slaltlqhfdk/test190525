package quizzz;

import java.util.Scanner;

public class P0514 {
	Scanner scan=new Scanner(System.in);

		private String id;
		private String pw;
		
		//로그인 메소드 선언
		void login1(String id, String pw) {
			//넘겨 받은 매게변수에 전달된 값을 필드에 저장
			this.id=id;
			this.pw=pw;
		//로그인성공 실패 여부 판단
			if(id.equals("yourld")&&pw.equals("12345")) {
				System.out.println(this.id+"님 로그인 되었습니다.");
			}else {
				System.out.println("id 또는 pw가 맞지 않습니다.");
			}			
		}
				




}
