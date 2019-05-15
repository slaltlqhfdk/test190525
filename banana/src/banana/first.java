package banana;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int value; int result;
		 * 
		 * value=10; result=value+10; //우변:value라는 변수가 가지고 있는 값과 10을 더함. //그리고 계산 결과를
		 * result에 저장
		 * //result 변수가 가지고 있는 값을 콘솔에 출력 System.out.println("result 값:"+result);
		 *   System.out.println("value 값:"+value);
		 * 
		 * byte popo=-128; byte dodo=0; byte wowo=127;
		 * System.out.println("popo 값"+popo+"dodo 값"+dodo+"wowo 값"+wowo);
		 * System.out.println("연산예제 포포 + 우우 = "+(popo+wowo));
		 */
		System.out.println("나의 정보를 출력하는 프로그램입니다");
		char myname = 'j';
		System.out.println("내 성은 : " + myname);
		int age = 25;
		System.out.println("내 나이:" + age);
		double key = 175.35;
		System.out.println("내 키는:" + key);
		boolean man = true;
		System.out.println("나는 누구인가:" + man);

		int birth = 19960925;
		System.out.println("내 생일은:" + birth);
		double weight = 73.2;
		System.out.println("내 몸무게는:" + weight);
		boolean work = true;
		System.out.println("중도포기:" + work);
		char mname = 'j';
		char myname2 = 'h';
		char myname3 = 'm';
		System.out.println(mname + " " + myname2 + " " + myname3);

		char myname4 = 'H', myname5 = 'w', myname6 = 'H';

		char kim, jae, hwi;
		kim = 'k';
		jae = 'j';
		hwi = 'h';
		System.out.println("자신의 이름 이니셜 3개" + kim + "" + jae + "" + hwi);
		char ename = 'g';
		char ename2 = 'h';
		System.out.println("중간이름은 " + ename + " " + ename2);
		int army = 13037865;
		System.out.println("내 군번은" + army);
		double height = 80;
		System.out.println("내 뺀 값은" + height);
		boolean male;
		boolean female;
		boolean male1 = true;
		boolean female2 = false;
		System.out.println("내성별은" + male1);
		System.out.println("다른성별" + female2);

		/*
		 * 정수형 변수를 2개 선언해서 +,-,*,/,& 연산을 하고 각 연산결과를 콘솔에 출력하세요
		 * 
		 */
		int jiji = 30;
		int zoom = 50;
		int animal;
		animal=jiji+zoom;
		System.out.println("더하기 값" + (jiji + zoom));
		System.out.println("뺀 값" + (jiji - zoom));
		System.out.println("곱한 값" + (jiji * zoom));
		System.out.println("나누기기" + (jiji / zoom));
		System.out.println("머지" + (jiji & zoom));

		//문자열 연결 예제
		//String 타입의 변수 선언
		String str="스트링 변수에 저장되는 값 ....! 어떤걸 쓰던 상관 없다";
		System.out.println(str);
		
		String str1= "자바";
		String str2= "빡친다!!!!!!!!";
		
		String str3;
		
		str3=str1+str2;
		System.out.println(str3);
		 
		str3= str1 +8+8;
		System.out.println(str3);    //문자가 먼저 오면 연결식(숫자가 먼저오면 계산이 됨.)
		
		str3= 8+8+str1;
		System.out.println(str3);
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
