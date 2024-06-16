public class ExtractDigit{
    public static void main(String[] args) {
        int n = 12345;

        while (n>0){
            int lastNumber = n%10;
            n/=10;
            System.out.print(lastNumber);
            //in reverse....

        }
    }
}