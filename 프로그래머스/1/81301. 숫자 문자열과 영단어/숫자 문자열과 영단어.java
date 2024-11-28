import java.util.HashMap;

class Solution {
    public long solution(String s) {
        // 숫자와 대응되는 영단어를 매핑한 HashMap
        HashMap<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);

        StringBuilder result = new StringBuilder(); // 최종 결과 숫자를 저장할 StringBuilder
        StringBuilder currentWord = new StringBuilder(); // 현재 영단어를 저장할 StringBuilder
        int i = 0; // 인덱스 초기화

        while (i < s.length()) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                // 숫자인 경우 결과에 추가
                result.append(c);
                i++;
            } else {
                // 영단어를 구성
                currentWord.append(c);
                // 현재 영단어가 numberMap에 존재하는지 확인
                if (numberMap.containsKey(currentWord.toString())) {
                    result.append(numberMap.get(currentWord.toString())); // 매핑된 숫자를 결과에 추가
                    currentWord = new StringBuilder(); // 새 StringBuilder로 초기화
                }
                i++;
            }
        }

        return Long.parseLong(result.toString());
    }
}