public class BinarySearch {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 5, 7, 7, 8, 9 };
        int n = a.length;
        int key = 7;
        int low = 0;
        int high = n - 1;
       

       while(low<=high){

            int mid = (high + low) / 2;

            if (a[mid] == key) {
                System.out.println("Key found at " + mid + " index");
                break;
            } 
            else if (key > a[mid]) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

    }
}
