import java.math.BigInteger;

class Solution {
    public int[] solution(int n, int m) {
        // 최대공약수 계산: BigInteger를 사용하여 GCD 계산
        int gcd = BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue();
        
        // 최소공배수 계산: LCM은 (n * m) / GCD 공식 사용
        int lcm = (n * m) / gcd;
        
        // 결과 배열 반환
        return new int[] {gcd, lcm};
    }
}