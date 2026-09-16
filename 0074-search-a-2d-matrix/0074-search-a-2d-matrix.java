class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length - 1;
        int left = 0, right = m - 1;
        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if(matrix[mid][0] > target)
                right = mid - 1;
            else if(matrix[mid][n] < target)
                left = mid + 1;
            else
                return BS(matrix[mid], target);
        }
        return false;
    }

    public static boolean BS(int []arr, int target)
    {
        int left = 0, right = arr.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            if(arr[mid] < target)
                left = mid + 1;
            else if(arr[mid] > target)
                right = mid - 1;
            else
                return true;
        }
        return false;
    }
}