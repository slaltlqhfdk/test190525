package quizzz;

public class Swhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1+(-2)+3+(-4)+5(-6)+ 답:199,합:100
		// 형태의 계산을 할때 얼마 까지 더해야 합계가 100이상이 되는지 구하시오

		int i = 0; //음의 짝수
		int num; //홀수
		int sum = 0;  //합한 변수 ,

		while (true) {
			i++;
			if (i % 2 == 0) { // 2를 나누고 나머지값이 0이면 같다 
				num = i * (-1);    // i 에 들어가는 숫자를 -1이랑 곱해서 음수가 되게 한다 
			}  //값이 -2 -4 -6 -8 

			else {  //값이 1 3 5 7 9
				num = i;  //위에서 짞수라는 경우를 주었기 때문에 홀수가 밑으로 내려온다

			}
			sum = sum + num; // -2이랑 1이내려와 계산을 하고  그러면-1이되어 위로올라가 다시 -4에 더한뒤 
			//3이랑 계산을 한다.

			if (sum >= 100) {
				break;
			}
		}
		System.out.println(i+""+sum);  //출력 값을 정한다
	}

}
