public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {8,3,6,9,2,1};
        int n = arr.length;
        Selection(arr, n);
    }

    static void Selection(int [] arr, int n){

        for(int i = 0; i<=n-2; i++){
            int min = i;
            for(int j = i+1; j<n; j++ ){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
       

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        } 
    }
}
