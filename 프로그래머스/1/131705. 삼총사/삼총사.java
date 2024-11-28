class Solution {
    public int solution(int[] number) {
        int count = 0; // 삼총사를 만들 수 있는 방법의 수

        // 배열에서 3명의 학생을 선택하는 모든 조합을 탐색
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    // 세 학생의 번호의 합이 0이면 카운트를 증가
                    if (number[i] + number[j] + number[k] == 0) {
                        count++;
                    }
                }
            }
        }

        return count; // 총 삼총사의 수를 반환
    }
}
