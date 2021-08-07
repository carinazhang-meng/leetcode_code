package jishiti.Qianxin.Game;

import Face_exercise.yuanfudao_07_31_01.Find;

/**
 * @Author Zhangmengyan
 * @Date 07/08/2021
 * 网格大小为m*n，进入一个点，按照位置的上下左右四个方向走，每个方格只能进去一次
 **/
public class GridPath {
    public static void main(String[] args) {
        int[][] grid = {{0, 6, 0}, {5, 8, 7}, {0, 9, 0}};
        getMaximumResource(grid);
        System.out.println(max1);
    }

    public static int getMaximumResource(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) FindPath(grid, i, j, 0);
            }
        }
        return max1;
    }

    static int max1 = 0;

    public static void FindPath(int[][] grid, int i, int j, int s) {
        if (grid[i][j] == 0) return;
        s += grid[i][j];
        int t = grid[i][j];
        grid[i][j] = 0;
        max1 = Math.max(max1, s);
        if (i < grid.length - 1) FindPath(grid, i + 1, j, s);
        if (i > 0) FindPath(grid, i - 1, j, s);
        if (j < grid[0].length - 1) FindPath(grid, i, j + 1, s);
        if (j > 0) FindPath(grid, i, j - 1, s);
        grid[i][j] = t;
    }
}
/*
递归的方法，上下左右，四个方向全都尝试一遍。
 */