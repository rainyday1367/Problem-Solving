class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] currentPosition = {0, 0};
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (currentPosition[1] < yLimit) {
                        currentPosition[1]++;
                    }
                    break;
                case "down":
                    if (currentPosition[1] > -yLimit) {
                        currentPosition[1]--;
                    }
                    break;
                case "left":
                    if (currentPosition[0] > -xLimit) {
                        currentPosition[0]--;
                    }
                    break;
                case "right":
                    if (currentPosition[0] < xLimit) {
                        currentPosition[0]++;
                    }
                    break;
            }
        }
        return currentPosition;
    }
}