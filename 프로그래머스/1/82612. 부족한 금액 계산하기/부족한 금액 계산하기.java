class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;

        for (int n = 1; n <= count; n++ ){
            sum += (long)n*price;
        }
        long result = sum - money;
        return result > 0 ? result : 0;
    }
}