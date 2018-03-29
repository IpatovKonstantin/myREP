import java.util.Scanner;

public class Exp3 {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    Boolean[] days = new Boolean[7];
        days[0] = true;
        days[1] = false;
        days[2] = true;
        days[3] = true;
        days[4] = true;
        days[5] = false;
        days[6] = false;

        if (days[i-1] == true)
            System.out.println("false");
        else System.out.println("true");
    }
}
