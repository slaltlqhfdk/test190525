package test;

public class C0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     //�ʱ� ���� �����ϸ鼭 2���� �迭 �����ϱ�
	    int[][] values = {{1,2,3},{4,5,6}}; //1=[0].[0] 2=[0],[1] 3=[0],[2] �� �ȿ� ȣ���̴�
	    for(int i=0; i<values.length; i++) { 
			   for(int j=0; j<values[i].length; j++) { 
				   System.out.println ("values["+i+"]["+j+"]"+"="+values[i][j]); 
			   }
	    }   //�̸����� 2���� �迭 �����ϱ�0
	    String[][] name = {{"Ȳ����","��ȣ��","������"},{"������","����","�̿��"}}; 
	    for(int i=0; i<name.length; i++) { 
			   for(int j=0; j<name[i].length; j++) { 
				   System.out.println ("name["+i+"]+["+j+"]"+"="+name[i][j]); 
			   }
			   }
	
	
	
	
	
	
	}

}
