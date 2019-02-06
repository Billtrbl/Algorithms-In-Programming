package HomeworkWeek2;

public class exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hopscotch(20);
	}

	public static void hopscotch(int num) {
	    int startNum = 1;
	    System.out.println("   " + startNum);
	    
	    while (num > 0) {
	        System.out.println(startNum + 1 + "     " + (startNum + 2));
	        startNum += 3;
	        System.out.println("   " + startNum);
	        num--;
	    }
	}
}
