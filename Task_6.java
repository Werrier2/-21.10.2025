import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  
    private static void calcula() {
        Scanner in = new Scanner(System.in);
        String[] inp = (in.nextLine()).split(" ");
        double a,b;
        String oper;
        if(inp.length == 1)
        {
            char[]t = inp[0].toCharArray();
            a = t[0]-'0';
            b = t[2]-'0';
            oper = String.valueOf(t[1]);
        }
        else
        {
            a = Double.parseDouble(inp[0]);
            b = Double.parseDouble(inp[2]);
            oper = inp[1];
        }
//        System.out.println(inp[1]);
        switch (oper){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if(b != 0)
                    System.out.println(a/b);
                else
                    System.out.println("Error: division by zero");
                break;
            default:
                System.out.println("Error wrong symbol");
        }

    }
    public static void main(String[] args){
        calcula();
    }
}
