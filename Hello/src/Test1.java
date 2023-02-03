
public class Test1 {

	public Test1() {
		
	}
	public int[] sol(int[] numbers, String direction) {
    	int temp =0;
    	if(direction.equals("right")) {
    		temp = numbers[numbers.length-1];
        	for(int i=numbers.length-2; i>=0; i--) {
         		numbers[i+1] = numbers[i];	
        	}
        	numbers[0] = temp;
        }else if(direction.equals("left")) {
        	temp = numbers[0];
        	for(int i=0; i<numbers.length-1; i++) {
        		numbers[i] = numbers[i+1];
        	}
        	numbers[numbers.length-1] = temp;
        }
        return numbers;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
