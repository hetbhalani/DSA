public class RecSearch {
    public static void main(String[] args) {
        int a[] = {1,3,5,6,8,9};
        int n = a.length;
        int low = 0;
        int high = n-1;
        int target = 8;
        
        System.out.println("Find an element at "+BiSrch(a,n,low,high,target)+" index");
    }

    static int BiSrch(int a[], int n, int low, int high,int target){

        while (low<=high) {
            int mid = (high + low)/2;

            
             if(target == a[mid]){
                return mid;
            }
            else if(target > a[mid]){
                
               return BiSrch(a, n, mid+1, high, target);
            }
            else{
               
               return BiSrch(a, n, low, mid-1, target);
            }
           
        }
        return -1;
        
    }
}
