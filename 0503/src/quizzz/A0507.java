package quizzz;

public class A0507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭(Array)
		// �������� �����͸� ��� ����
		// �迭 �����ϱ�
		// �ȿ� �ִ� �迭�� ������ �ǹ̴� �迭ũ���(����) 3��, �迭 �ε����� 2!
		int[] scores = { 90, 95, 80 };
		//
		// �ȿ� ���ڸ� �ε������ϰ� 90���� 0 1 2 �� �ȴ�

		// �迭�� �� ��ҿ� �����ؼ� �� ����ϱ�
		// scores[0]
		// scores�� ��հ��� ���غ��ÿ� �� �ؿ� ��
		System.out.println("scores[o]�� ��:" + scores[0]);
		System.out.println("scores[1]�� �� :" + scores[1]);
		System.out.println("scores[2]�� ��:" + scores[2]);
		double avg;
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {//>���ھ� ������ �Ѹ���� int[3] {
			System.out.println("[" + i + "]" + "scores" + scores[i]);//i�� 0�� ��  scores[i]=90
			sum = sum + scores[i]; //scores[i]0=90�϶� �濡 ���Եȴ�

		}
		avg = sum / scores.length; // 0,1,2,=90,95,80�� ���� int3�� ���ھ �� ���� ������ ��հ��� ���´�
		System.out.println("���:" + avg); 

	}

}
