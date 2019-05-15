package quizzz;

public class A0507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열(Array)
		// 여러개의 데이터를 담는 변수
		// 배열 선언하기
		// 안에 있는 배열의 숫자의 의미는 배열크기는(길이) 3개, 배열 인덱스는 2!
		int[] scores = { 90, 95, 80 };
		//
		// 안에 숫자를 인덱스라하고 90부터 0 1 2 가 된다

		// 배열의 각 요소에 접근해서 값 출력하기
		// scores[0]
		// scores의 평균값을 구해보시오 맨 밑에 답
		System.out.println("scores[o]의 값:" + scores[0]);
		System.out.println("scores[1]의 값 :" + scores[1]);
		System.out.println("scores[2]의 값:" + scores[2]);
		double avg;
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {//>스코어 랭스는 한마디로 int[3] {
			System.out.println("[" + i + "]" + "scores" + scores[i]);//i가 0일 때  scores[i]=90
			sum = sum + scores[i]; //scores[i]0=90일때 썸에 대입된다

		}
		avg = sum / scores.length; // 0,1,2,=90,95,80에 값을 int3이 스코어에 들어가 섬에 나누어 평균값이 나온다
		System.out.println("평균:" + avg); 

	}

}
