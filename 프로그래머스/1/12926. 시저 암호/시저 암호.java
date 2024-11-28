class Solution {
    public String solution(String s, int n) {
        // 결과 문자열을 저장할 StringBuilder
        StringBuilder result = new StringBuilder(); 

        // 입력 문자열의 각 문자를 처리합니다.
        for (char c : s.toCharArray()) {
            // 공백일 경우 그냥 추가합니다.
            if (c == ' ') {
                result.append(c);
            } else {
                // 알파벳을 n만큼 시프트하여 결과에 추가합니다.
                if (Character.isUpperCase(c)) {
                    // 대문자인 경우
                    char shiftedChar = (char) ((c - 'A' + n) % 26 + 'A');
                    result.append(shiftedChar);
                } else {
                    // 소문자인 경우
                    char shiftedChar = (char) ((c - 'a' + n) % 26 + 'a');
                    result.append(shiftedChar);
                }
            }
        }
        
        return result.toString(); // 최종 결과 문자열을 반환
    }
}