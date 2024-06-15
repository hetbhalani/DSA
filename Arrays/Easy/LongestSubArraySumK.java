public class LongestSubArraySumK {
    public static void main(String[] args) {
        int a[] = {1,2,3,1,1,1,4,5,3,3};
        int left = 0, right = 0;
        int sum = a[0];
        int maxLen = 0;
        int n = a.length;

        while(right < n){
            right++;
            if(right < n){
                sum += a[right];
            }
        }
    }
}
