package second;

public class B0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /*
	     * ������ �迭
	     * :2���� �̻��� �迭
	     * :��xduf fh ǥ��
	     * ���� ��� 2�� 3�� �迭�� �� 6���� ������ ����
	     * 
	     */
	     //2���� �迭 ����
		 //�������� 2�� 3��¥�� �迭
		int[][] scores= new int[2][3];
		int[][] scores1= new int[3][3];
		//�迭�� ũ�� Ȯ��
		System.out.println(scores.length);  //�� Ȯ�� �Ҷ� 
	    System.out.println(scores1.length);
	    System.out.println(scores[0].length); //�� Ȯ���� ��
	    System.out.println(scores[1].length);
	
	    //�迭�� �ʱⰪ Ȯ��
	    //�ߺ� for���� �̿��Ͽ� [0][0]~[1][2]���� �� Ȯ��
	  
	    for(int i=0; i<scores.length; i++) { //�࿡ ���� �ΰ��ϱ� 0,1�� �����°��̰�
			   for(int j=0; j<scores[i].length; j++) { //������ �����ϱ� 0.1.2�� ���´�
				   System.out.println ("scores["+i+"]["+j+"]"+"="+scores[i][j]); 
			   }
	    }
	
	}

}
