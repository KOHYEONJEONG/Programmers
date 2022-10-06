public class duplicateNumbers { //중복된 숫자 개수(0레벨)
	public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int data: array) {
        	if(data == n) {
        		answer++;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		duplicateNumbers d = new duplicateNumbers();
		int[] array = {1, 1, 2, 3, 4, 5};
		int result = d.solution(array, 1);
		System.out.println(result);
	}
}
