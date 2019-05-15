package second;

public class B0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /*
	     * 다차원 배열
	     * :2차원 이상의 배열
	     * :행xduf fh 표현
	     * 예를 들어 2행 3열 배열은 총 6개의 데이터 가정
	     * 
	     */
	     //2차원 배열 선언
		 //정수형의 2행 3열짜리 배열
		int[][] scores= new int[2][3];
		int[][] scores1= new int[3][3];
		//배열의 크기 확인
		System.out.println(scores.length);  //행 확인 할때 
	    System.out.println(scores1.length);
	    System.out.println(scores[0].length); //열 확인할 때
	    System.out.println(scores[1].length);
	
	    //배열의 초기값 확인
	    //중복 for문을 이용하여 [0][0]~[1][2]까지 값 확인
	  
	    for(int i=0; i<scores.length; i++) { //행에 열이 두개니깐 0,1만 나오는것이고
			   for(int j=0; j<scores[i].length; j++) { //열에는 세개니깐 0.1.2가 나온다
				   System.out.println ("scores["+i+"]["+j+"]"+"="+scores[i][j]); 
			   }
	    }
	
	}

}
