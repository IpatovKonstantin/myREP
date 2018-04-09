
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    static Office office = new Office();
    public static int n;

    public static void fill(){
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            Employee employee = new Employee(in.next(), in.next(),in.nextInt(), Runk.valueOf(in.next()));
            office.add(employee);
        }
    }

    public static void outInfo(){
            office.showEmployeeList();
    }

    public static void find(){
        String runkName = in.next();
        Runk runk = Runk.getRunk(runkName);
        if (runk==null){
            System.out.println("Неизвестная должнось "+ runkName);
        } else {
            for (Employee employee: office.find(runk)){
                System.out.println(employee);

            }
        }
    }

    public static void sor(){
        office.sort();
        office.showEmployeeList();

    }

    public static void main(String[] args){
        System.out.println("ВВедите команду");

        String command1 = in.next();
        if (command1.equals("fill")) {
            fill();
        }

//        String command2 = in.next();
//        if (command2.equals("out")) {
//            outInfo();
//        }
        sor();

//        String command3 = in.next();
//        if (command3.equals("find")){
//            find();
//        }
    }
}
