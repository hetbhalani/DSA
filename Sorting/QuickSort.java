public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {8, 3, 6, 9, 2, 1};
        int n = arr.length;

        quick(arr,0,n-1);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void quick (int [] arr,int low,int high){
        if(low<high){
            int pivot = partition(arr,low,high);
            quick(arr, low, pivot-1);
            quick(arr, pivot+1, high);
        }
    }

    static int partition(int []arr, int low, int high){
        
        int pivot = arr[low];
        int i = low+1;
        int j = high;

        while(i<=j){
            while(arr[i] <= pivot && i<=j){
                i++;
            }
            while (arr[j] > pivot && i<=j) {
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }

        }
        arr[low] = arr[j];
            arr[j] = pivot;
            
            return j;
    }
}
