import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length]; // 결과를 담을 1차원 배열 초기화

        // 각 명령어에 대해 처리
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i]; // 현재 명령어를 가져옴
            int start = command[0] - 1; // 시작 인덱스 (0 기반으로 변환)
            int end = command[1]; // 끝 인덱스 (잘라낼 부분의 끝 인덱스, 포함하지 않음)
            int k = command[2] - 1; // k번째 인덱스 (0 기반으로 변환)

            // 잘라낸 배열을 생성
            int[] subArray = Arrays.copyOfRange(array, start, end);

            // 잘라낸 배열을 정렬
            Arrays.sort(subArray);

            // 정렬된 배열에서 k번째 숫자를 result에 추가
            result[i] = subArray[k]; // 정렬된 배열의 k번째 숫자를 result의 i번째 요소로 설정
        }

        return result; // 결과 배열 반환
    }
}