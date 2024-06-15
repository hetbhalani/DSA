public class MaxConsicutiveOnes {
    public static void main(String[] args) {
        int a[] = {1,1,0,0,1,1,1,0,1};
        int n = a.length;
        int maxi = 0;
        int count = 0;

        for(int i = 0; i<n; i++){
            if(a[i]==1){
                count++;
            }
           else {
                count=0;
            }
            maxi = Math.max(maxi, count);
        }
        System.out.println(maxi);

    }
}