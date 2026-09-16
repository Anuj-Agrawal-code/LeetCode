class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int arr[] = new int[n];

        if (k > 0) {
            for (int front = 0; front < n; front++) {
                int sum = 0;
                int f = front;

                for (int s = 0; s < k; s++) {
                    f = (f + 1) % n;
                    sum += code[f];
                }

                arr[front] = sum;
            }
        }

        else if (k < 0) {
            for (int front = 0; front < n; front++) {
                int sum = 0;
                int f = front;

                for (int s = 0; s < -k; s++) {
                    f = (f - 1 + n) % n;
                    sum += code[f];
                }

                arr[front] = sum;
            }
        }

        return arr;
    }
}