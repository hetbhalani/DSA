public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,6,7,7,5};

        int sl = -1;
        int largest = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
                sl = largest;
                largest = arr[i];  
            }
           else if(arr[i]> sl && arr[i]!= largest){
                sl = arr[i];
            }
        }
        System.out.println(sl);
    }   
}
