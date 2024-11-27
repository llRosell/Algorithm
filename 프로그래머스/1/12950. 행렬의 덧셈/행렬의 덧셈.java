class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;       // 행의 개수
        int cols = arr1[0].length;    // 열의 개수

        // 결과를 저장할 행렬 생성
        int[][] result = new int[rows][cols];

        // 행렬 덧셈
        for (int i = 0; i < rows; i++) {         // 행 반복
            for (int j = 0; j < cols; j++) {     // 열 반복
                result[i][j] = arr1[i][j] + arr2[i][j]; // 같은 위치 값을 더하기
            }
        }

        return result; // 결과 행렬 반환
    }
}