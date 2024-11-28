class Solution {
    public int solution(String t, String p) {
        int count = 0; // 조건을 만족하는 부분 문자열의 개수를 저장할 변수
        long pValue = Long.parseLong(p); // p를 숫자로 변환
        
        // t의 부분 문자열을 순회하며 조건을 확인
        for (int i = 0; i <= t.length() - p.length(); i++) {
            // 부분 문자열을 추출 후 숫자로 변환
            long subValue = Long.parseLong(t.substring(i, i + p.length())); 
            
            if (subValue <= pValue) {
                count++; // 조건을 만족하면 카운트 증가
            }
        }
        
        return count; // 결과 반환
    }
}
