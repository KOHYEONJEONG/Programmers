
public class addDigits {//자릿수 더하기
	public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] items = str.split("");
        
        for(String data : items) {
        	answer += Integer.parseInt(data);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		addDigits ad = new addDigits();
		
		int result = ad.solution(1234);
		System.out.println("정답 : "+result);
	}
}
