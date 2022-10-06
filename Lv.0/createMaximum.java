public class createMaximum {//최대값 두 수를 곱하기
	 public int solution(int[] numbers) {
		 	int[] arr = numbers;
		 	int temp = 0;
		 	
		 	for(int i=0; i<arr.length-1; i++) {//뒤에서부터 정렬이됨 그래서 -1(마지막은 이미 정렬되어있으니까)
		 		for(int j=0; j<arr.length-i-1; j++) {
		 			if(arr[j]<arr[j+1]) {
		 				temp = arr[j];
		 				arr[j] = arr[j+1];
		 				arr[j+1] = temp;
		 			}
		 		}
		 	}
	        int answer = arr[0]*arr[1];
	        return answer;
	    }
	
	public static void main(String[] args) {
		createMaximum cm = new createMaximum();
		int[] array = {1, 2, 3, 4, 5};
		int result =  cm.solution(array);
		System.out.println(result);
		
	}
}
