public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 6, 9, 2, 1, 3, 6};
        int n = arr.length;

        Insertion(arr, n);
    }    

    static void Insertion(int [] arr, int n){
        for(int i = 0; i<n; i++){
            int j = i;
            while(j>0 && (arr[j-1]>arr[j])){
                int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
            }
        }
        for(int i = 0; i< n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
