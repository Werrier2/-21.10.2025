import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static void table() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    public static void main(String[] args){
        table();
    }
}
