class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int x = 1; x <= n; x++) {
             if(n % x == 1)
                 return answer = x;
        }
        return answer;
    }
}