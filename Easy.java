
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int result = lengthOfLast(s);
        System.out.println(result);
    }

    public static int lengthOfLast(String s) {
        int len = 0;

       
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                len++;
            }
           
            else if (len > 0) {
                break;
            }
        }

        return len;
    }
}
