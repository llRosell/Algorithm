class Solution {
    public String solution(String s) {
    // 최종 결과 문자열을 저장할 StringBuilder
    StringBuilder result = new StringBuilder(); 
    // 현재 문자의 위치 (단어 기준으로 초기화됨)
        int index = 0; 

        // 입력 문자열을 문자 배열로 변환
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                // 공백일 경우 그대로 결과 문자열에 추가하고, 인덱스를 초기화하지 않음
                result.append(c);
                index = 0; // 새로운 단어로 시작하므로 인덱스를 초기화
            } else {
                // 짝수 인덱스는 대문자, 홀수 인덱스는 소문자로 변환
                if (index % 2 == 0) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                index++; // 공백이 아닌 경우에만 인덱스를 증가
            }
        }
        return result.toString();
    }
}