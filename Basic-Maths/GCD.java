//Equilateral Algorithm

public class GCD {
    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }

    public static int findGcd(int a, int b) {
        while (a > 0 && b > 0) {
          
            if (a > b) {   
                a = a % b;
            }
            
            else {      
                b = b % a;
            }
        }
       
        if (a == 0) {
            return b;
        }
        return a;
    }
}
