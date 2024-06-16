public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12332;
        int store = n;
        int rev = 0;

        while(n>0){
            int ld = n%10;
            rev = (rev*10)+ld;
            n/=10;   
        }

        if(rev == store){
            System.out.println(store + " is a palindrome number");
        }
        else{
            System.out.println(store + " is not a palindrome number");
        }
    }
}
