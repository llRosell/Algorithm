class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
         answer = sqrt % 1 == 0 ? (long) ((sqrt + 1) * (sqrt + 1)) : -1;
        return answer;
    }
}