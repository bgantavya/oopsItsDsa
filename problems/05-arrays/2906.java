// LeetCode Problem 2906: Construct the Product Matrix II   
//not completed yet
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        long product = 1;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                product *= grid[i][j];
            }
        }
        // product %= 12345;
        // (int) product;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                grid[i][j] = (int)((product /(long) grid[i][j]) %12345);
            }
        }
        return grid;

    }
}