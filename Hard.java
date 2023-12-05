
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int result = countOnes(n);
        System.out.println(result);
    }

    public static int countOnes(int n) {
        int count = 0;

        int factor = 1;
        int higherPart = n;

        while (higherPart > 0) 
        {
            int curr = higherPart % 10;
            higherPart /= 10;

            count += higherPart * factor;

            if (curr == 1) {
                count += (n % factor) + 1;
            } else if (curr > 1) {
                count += factor;
            }

            factor *= 10;
         }

        return count;
    }

}