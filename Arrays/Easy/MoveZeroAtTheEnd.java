public class MoveZeroAtTheEnd {
    public static void main(String[] args) {
        int a[] = {1,0,0,6,5,3,0,2,0};
        int n = a.length;

        int j = -1;
        for(int i = 0; i<n; i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }

        for(int i = j+1; i<n; i++){
            if(a[i]!=0){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }

        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
