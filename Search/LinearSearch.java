public class LinearSearch {
    public static void main(String[] args) {
        int a [] = {1,2,5,3,8,5,8,9};
        int n = a.length;
        int key = 8;

        for(int i = 0; i<n; i++){
            if(a[i] == key){
                System.out.println("Found at "+i+"th index");
            }
        }
    }    
}
