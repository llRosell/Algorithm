class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            int divCnt = 0;
        
            for(int j = 1; j <= i; j++){
                if( i % j == 0){
                  divCnt++;
            }   
        }
        
        if ( divCnt % 2 ==0) {
            answer += i;
            } else { answer -= i; }
        }
        return answer;
    }
}