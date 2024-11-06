class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int totalsum = 0;
        int arrsum = 0;

        for (int i = 0; i < 10; i++ ) {
                totalsum += i;
        }
        
        for (int i = 0; i < numbers.length; i++ ) {
                arrsum += numbers[i]; 
        } 
            
          answer = totalsum - arrsum;  
        return answer;
    }
}