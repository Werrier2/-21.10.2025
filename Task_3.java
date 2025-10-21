import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static int symbol(char a) {
//        Scanner in = new Scanner(System.in);
//        String inp = in.nextLine();
//        char[]let = inp.toCharArray();
        int num = (int) a;
//        System.out.println(num);
        boolean flag = true;
        if(num <= 57 && num >= 48) {
//            System.out.println("Number");
            flag = false;
            return 0;
        }
        else if((num <= 90 && num >= 65) || (num >= 97 && num <= 122)){
//            System.out.println("Letter");
            flag = false;
            return 1;
        }
        if(flag){
//            System.out.println("Other char");
            return 2;
        }
        return -111;
    }

    private static void scanline() {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char[]letters = n.toCharArray();
        int[]res = {0,0,0};
        for(char j : letters)
        {
            if((int) j == 32)
                continue;
            res[symbol(j)]++;
        }
        System.out.println("Numbers: " + res[0]);
        System.out.println("Letters: " + res[1]);
        System.out.println("Other symbols: " + res[2]);
    }

    public static void main(String[] args){
        scanline();
    }
}
