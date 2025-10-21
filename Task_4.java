import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static void inputSum(){
        int x = 1;
        long sum = 0;
        while(x != 0) {
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            sum+=x;
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        inputSum();
    }
}
