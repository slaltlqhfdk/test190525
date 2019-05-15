package today;

import java.util.Scanner;

public class Exercise { 
       //이름,국어,영어 점수를 저장할 필드 선언
	   private String name;
       private int KoreanScore;
       private int EnglishScore;
        
       //생성자 선언(생성자의 이름은 클래스 이름과 동일하게!)
       public Exercise(String name2, int koreanScore2, int englishScore2) {
    	 
        }
    
       public Exercise() {
       }
	
       
       
       
      public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKoreanScore() {
		return KoreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		KoreanScore = koreanScore;
	}

	public int getEnglishScore() {
		return EnglishScore;
	}

	public void setEnglishScore(int englishScore) {
		EnglishScore = englishScore;
	}

	void result( ) {
    	  
      }



}
