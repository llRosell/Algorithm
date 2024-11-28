class Solution {
    public int solution(int n) {
        // n을 3진법 문자열로 변환 후 뒤집고, 10진법으로 변환
        String reversedTernary = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        
        int answer = 0; // 결과 저장할 변수
        int length = reversedTernary.length();
        
        // 뒤집은 3진법 문자열을 10진법으로 변환
        for (int i = 0; i < length; i++) {
            answer += (reversedTernary.charAt(length - 1 - i) - '0') * Math.pow(3, i);
        }
        
        return answer; // 결과 반환
    }
}