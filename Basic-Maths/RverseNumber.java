//Optimal approch

public class RverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int RevNum = 0;

        while(n>0){
            int lastDigit = n%10;
            RevNum = (RevNum * 10) + lastDigit;
            n/=10;   
        }
        System.out.println(RevNum);
    }
}
