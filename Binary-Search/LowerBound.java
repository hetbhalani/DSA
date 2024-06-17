public class LowerBound {
    public static void main(String[] args) {
        int a [] = {1,2,2,3,5,7,9,10};
        int n = a.length;
        int low = 0;
        int high = n-1;
        int target = 8;
        int ans = n;
        
        while(low<=high){
            int mid = (low+high)/2;

            if(target <= a[mid]){
                ans = mid;
                high = mid -1;
            }
            else {
                low = mid +1;
            }
        }
        System.out.println(ans);
    }
}
