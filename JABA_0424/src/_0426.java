import java.util.Scanner;

public class _0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ��Ȳ ������
		 * ����:
         * (���ǽ�) ? ������ true �϶� ���: false �϶� ���         
		 */
		 int score =80;
		 String grade;
		 //��Ȳ ������ ���
		 grade=(score > 90)? "A" : "B";
		 /*
		  * score�� 90 ���� ũ��
		  * grade="A"
		  * score�� 90���� ������ 
		  * grade="B"�� ó��
		  */
		System.out.println("grade ���� ��:" +grade);		
		
		int score1=600;
		String vella;
		vella=(score1<600)? "A" :"B";
 		System.out.println("vella ���� ��:"+score1);
 		
		/*
		 *���� ������
		 *����:++,--
		 *���� �տ� ++�� ���� ������ ������ �ִ� ���� 
		 *1�� ������Ų �� ���꿡 �����,
		 *���� �ڿ� ++�� ���� ������ ������ �մ� ���� 
		 *�ϴ� ���꿡 ����� �� ���� ���� 1 ������Ŵ. 
		 */
		 int x =10;   //z=x++ (x���� ����ϰ� ���߿� ����), z=++x (x���� 1���ϰ� ����)
		 int y =10;       
		 int z;
		 System.out.println(x);
		 x++;
		 System.out.println(x);
		 
         
		
		 //��ĳ�ʸ� ����ϱ� ���� ����
		 Scanner scan = new Scanner(System.in);
		 String name;
		 System.out.print("�̸��� �Է��ϼ���:");
		 name=scan.next();
		 System.out.println("�Է��� �̸���"+name+"�Դϴ�.");
		
		 
		 
		 /*
		  * �����Է�:next()
		  * �����Է�:nextInt()
		  * �Ǽ��Է�:nextDouble()
		  * 
		  */
		 int age;
		 System.out.print("���̸� �Է��ϼ���:");
		 age=scan.nextInt();
		 

		 
		
		 
		 String home;
		 System.out.print("�ּҸ� �Է��ϼ���:");
		 
		 home=scan.next();
		 System.out.println("�Է��� ���̴� "+home+"�Դϴ�.");
		 scan.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
