class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        if(startColor != color){
            dfs(image,sr,sc,startColor,color);
        }
        return image;
    }

    public void dfs(int[][] image, int r, int c, int startColor, int newColor){
        if(r < 0 || r >= image.length ||  c < 0 || c >= image[0].length){
            return;
    }
    if(image[r][c] != startColor){
        return;
    }
    image[r][c] = newColor;

    dfs(image,r+1,c,startColor,newColor);
    dfs(image,r-1,c,startColor,newColor);
    dfs(image,r,c+1,startColor,newColor);
    dfs(image,r,c-1,startColor,newColor);
  }
}