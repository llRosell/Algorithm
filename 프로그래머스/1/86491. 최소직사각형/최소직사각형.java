class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0; //지갑의 최대 가로 크기
        int maxHeight = 0; //지갑의 최대 세로 크기
        
        for( int[] size : sizes ) {
            int w = Math.max(size[0], size[1]); //가로와 세로 중 더 긴쪽
            int h = Math.min(size[0], size[1]); //가로와 세로 중 더 짧은쪽
            
            //지갑의 크기 갱신
            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }
     return maxWidth * maxHeight;
    }
}