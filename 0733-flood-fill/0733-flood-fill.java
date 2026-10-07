class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int originalColor = image[sr][sc];

        if(originalColor == color)
            return image;

        paint(image, sr, sc, color, originalColor);

        return image;
    }

    public void paint(int[][] image, int sr, int sc, int color, int originalColor)
    {
        if(sr < 0 || sr >= image.length)
            return;
        if(sc < 0 || sc >= image[0].length)
            return;

        if(image[sr][sc] != originalColor)
            return;

        image[sr][sc] = color;
        paint(image, sr -1, sc, color, originalColor);         //left
        paint(image, sr + 1, sc, color, originalColor);        //right
        paint(image, sr, sc - 1, color, originalColor);        //up
        paint(image, sr, sc + 1, color, originalColor);        //down
    }
}