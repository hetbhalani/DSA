public class FirstAndLastAccurence {
    public static void main(String[] args) {
        
        int a []= {1,3,6,6,8,8,8,9,10};
        int n = a.length;
        int first = -1;
        int last = -1;
        int target = 8;

        for(int i = 0 ; i < n; i++){
            if(a[i] == target){
                if(first == -1){
                first = i;
                }
                last = i;
            }
        }
        System.out.println(first+" "+ last);

    }
}
