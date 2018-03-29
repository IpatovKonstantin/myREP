import java.util.Scanner;

public class Exp4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str.length();
        int[] Ch = new int[str.length()];
        int j=str.length();
        int i=0;

        for (int k= 0; k<j; k++)
            Ch[k] = (int) str.charAt(k);
        while ((j-i>1)&&(Ch[i]==Ch[j-1])){
            i++;
            j--;
        }
        if (i==j-1)
            System.out.println("палиндром");
        else System.out.println("не палиндром");


        System.out.println(str.charAt(str.length()-1));

    }
}
