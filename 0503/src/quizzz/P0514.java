package quizzz;

import java.util.Scanner;

public class P0514 {
	Scanner scan=new Scanner(System.in);

		private String id;
		private String pw;
		
		//�α��� �޼ҵ� ����
		void login1(String id, String pw) {
			//�Ѱ� ���� �ŰԺ����� ���޵� ���� �ʵ忡 ����
			this.id=id;
			this.pw=pw;
		//�α��μ��� ���� ���� �Ǵ�
			if(id.equals("yourld")&&pw.equals("12345")) {
				System.out.println(this.id+"�� �α��� �Ǿ����ϴ�.");
			}else {
				System.out.println("id �Ǵ� pw�� ���� �ʽ��ϴ�.");
			}			
		}
				




}
