public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 6, 9, 2, 1 };
        int n = arr.length;

        Bubble(arr, n);
    }

    static void Bubble(int[] arr, int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //sorted
        for(int i = 0; i< n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

}
