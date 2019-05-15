package second;

public class Key {
	int speed;
        void keyTurnOn() {
        System.out.println("시동을 부릉부릉");
        }
        
       
        void run() {
        	System.out.println("run 호출");
        	for(int i=10;i<=50;i+=10 ) {
        		speed =i;
        	System.out.println("시속:"+speed+"km/h");
        	}
        	System.out.println("run 호출끝");
        
        }
        
        
        
      


}
