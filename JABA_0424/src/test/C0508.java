package test;

public class C0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     //초기 값을 지정하면서 2차원 배열 선언하기
	    int[][] values = {{1,2,3},{4,5,6}}; //1=[0].[0] 2=[0],[1] 3=[0],[2] 방 안에 호수이다
	    for(int i=0; i<values.length; i++) { 
			   for(int j=0; j<values[i].length; j++) { 
				   System.out.println ("values["+i+"]["+j+"]"+"="+values[i][j]); 
			   }
	    }   //이름으로 2차원 배열 선언하기0
	    String[][] name = {{"황원휘","장호민","이현태"},{"박현식","최현","이우민"}}; 
	    for(int i=0; i<name.length; i++) { 
			   for(int j=0; j<name[i].length; j++) { 
				   System.out.println ("name["+i+"]+["+j+"]"+"="+name[i][j]); 
			   }
			   }
	
	
	
	
	
	
	}

}
