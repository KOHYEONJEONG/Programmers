
public class aManTallerThan {//머쓱이보다 키 큰 사람
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++ ) {
        	
        	if(array[i] > height) {
        		answer++;
        	}
        	
        }
        
        return answer;
    }
	public static void main(String[] args) {
		aManTallerThan tall = new aManTallerThan();
		int[] array = {149, 180, 192, 170};
		int result =  tall.solution(array, 167);
		System.out.println(result);
	}
}
