class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if (( 0 <= num1 && num1 <= 10000) && ( 0 <= num2 && num2 <= 10000 )){
            if(num1 == num2){
                return 1;
            } else
            return -1;
            }
        return answer;
    }
}