class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        
        int length = phone_number.length();
        
        String hidden = "*".repeat(length-4);
        String number = phone_number.substring(length-4);
        answer = hidden + number;
            return answer;
    }
}