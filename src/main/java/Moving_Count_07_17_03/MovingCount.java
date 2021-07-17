package Moving_Count_07_17_03;

/**
 * @Author Zhangmengyan
 * @Date 17/07/2021
 * 动态规划
 **/
public class MovingCount {
    public static int count = 0;//定义一个全局变量

    public static void main(String[] args) {
        int m = 3;
        int n = 1;
        int k = 0;
        System.out.println(MoveCount(m, n, k));
    }

    public static int MoveCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        backtrack(visited, 0, 0, m, n, k);
        return count;
    }

    public static void backtrack(boolean[][] visited, int i, int j, int m, int n, int k) {
        if (i < m && j < n && (i / 10 + i % 10 + j / 10 + j % 10) <= k) {
            count++;
            visited[i][j] = true;
            backtrack(visited, i + 1, j, m, n, k);
            backtrack(visited, i, j + 1, m, n, k);
        }

    }
}
