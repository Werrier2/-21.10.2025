import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static void revert(){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char[] symbs = n.toCharArray();
        boolean flag = true;
        for(int i = symbs.length-1; i > -1; i--)
        {
            System.out.print(symbs[i]);
            if(symbs[i] != symbs[symbs.length-i-1])
                flag = false;
        }
        if(flag) {
            System.out.println();
            System.out.println("Palindrom");
        }
    }

    public static void main(String[] args){
        revert();
    }
}
