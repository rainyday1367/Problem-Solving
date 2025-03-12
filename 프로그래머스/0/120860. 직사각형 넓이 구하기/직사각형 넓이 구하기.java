class Solution {
    public int solution(int[][] dots) {
        // 결국 2차원 좌표 평면 최대 - 최소 x, y
        int answer = 0;
        
        int minX = dots[0][0];
        int minY = dots[0][1];
        int maxX = dots[1][0];
        int maxY = dots[1][1];
        
        for (int i = 0; i < dots.length; i++) {
            minX = Math.min(minX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxX = Math.max(maxX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
        }
        answer = Math.abs(maxX - minX) * Math.abs(maxY - minY);
        return answer;
    }
}