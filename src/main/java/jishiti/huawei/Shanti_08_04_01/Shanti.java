package jishiti.huawei.Shanti_08_04_01;

import java.util.Scanner;

/**
 * @Author Zhangmengyan
 * @Date 04/08/2021
 **/

public class Shanti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();

        int[][] height = new int[w][h];
        int[][] visited = new int[w][h];
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height[i].length; j++) {
                height[i][j] = sc.nextInt();
            }
        }
        int maxArea = maxAreaOfIsland(height, visited);
        System.out.println(maxArea);

    }

    public static int maxAreaOfIsland(int[][] grid, int[][] visited) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0 && visited[i][j] == 0) {   // 遍历网格中的每个点，当这个点是未遍历过的岛屿时，计算这个岛屿所在的面积
                    int area = Area(grid, i, j, visited);      // 计算当前岛屿所在的岛屿的面积
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    public static int Area(int[][] grid, int r, int c, int[][] visited) {
        if (!inArea(grid, r, c)) {                // 当前岛屿的周围四个点没有越界
            return 0;
        }
        if (grid[r][c] == 0 || visited[r][c] == 1) {     // 当前的点不是未遍历过的岛屿
            return 0;
        }
        visited[r][c] = 1;                         // 遍历过当前岛屿之后，标记岛屿，这样防止重复遍历
        return grid[r][c]                          // 返回当前遍历的岛屿的面积
                + Area(grid, r - 1, c, visited)
                + Area(grid, r + 1, c, visited)
                + Area(grid, r, c - 1, visited)
                + Area(grid, r, c + 1, visited);
    }

    public static boolean inArea(int[][] grid, int r, int c) {  // 判断当前岛屿的周围四个点是否越界
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }


}