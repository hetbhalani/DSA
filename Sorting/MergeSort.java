import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {8, 3, 6, 9, 2, 1};
        int n = arr.length;
        
        Divide(arr,0,n-1);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void Divide(int [] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (high+low)/2;

        Divide(arr, low, mid);
        Divide(arr, mid+1, high);
        Merge(arr, low, mid, high);
    }

    static void Merge(int arr[],int low ,int mid, int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high){
            if(arr[left]>=arr[right]){
                temp.add(arr[right]);
                right++;
            }
            else{
                temp.add(arr[left]);
                left++;
            }
        }

        //vaydha ghayta elements mate...

        while (left <= mid) {
            temp.add(arr[left]);
            left++;  
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        //aama gota thai evu chhe...
        for(int i = 0; i<temp.size(); i++){
            arr[low + i] = temp.get(i);
        }
    }
}
