class Solution {
    public String solution(int n) {
        String answer = "";
        int length = n;
        
        answer = "수박".repeat(length/2);
        
        if (length % 2 ==1 ) {
            answer = answer + "수";
        } 
        return answer;
    }
}