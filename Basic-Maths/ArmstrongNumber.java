public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 174172;
        int store = n;
        int sum = 0;
        int numDigit = countDigits(n);
          

        while(n>0){
            int ld = n%10;
            sum += (int) Math.pow(ld,numDigit);
            n/=10;
            System.out.println(sum);
        }
        
        if(store == sum){
            System.out.println(store+" is an armstrong number");
        }
        else{
            System.out.println(store+" is not an armstrong number");

        }

    }
    private static int countDigits(int store) {
        int count = 0;
        while (store > 0) {
            count++;
            store /= 10;
        }
        return count;
    }
}
