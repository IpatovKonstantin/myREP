
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    static Office office = new Office();
    public static int n;

    public static void fill() {

        System.out.println("количество сотрудников");

        n = in.nextInt();
        System.out.println("фамилия, имя, зарплата, должность");
        for (int i = 0; i < n; i++) {
            Employee employee = new Employee(in.next(), in.next(), in.nextInt(), Runk.valueOf(in.next()));
            office.add(employee);
        }
    }

    public static void outInfo() {
        office.showEmployeeList();
    }

    public static void find() {
        String runkName = in.next();
        Runk runk = Runk.getRunk(runkName);
        if (runk == null) {
            System.out.println("Неизвестная должнось " + runkName);
        } else {
            for (Employee employee : office.find(runk)) {
                System.out.println(employee);
            }
            if (office.find(runk).size() == 0) {
                System.out.println("нет в команде");
            }
        }
    }

    public static void sor() {
        office.sort();
        office.showEmployeeList();

    }

    public static void main(String[] args) {
        System.out.println("ВВедите команду");
        Boolean t = true;
        while (t) {
            System.out.println("1:Заполнить сотрудников");
            System.out.println("2:Вывод сотрудников");
            System.out.println("3:Поиск сотрудника по должности");
            System.out.println("4:Отсортировать сотрудников и вывод");
            System.out.println("5:Выход");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    fill();
                    break;
                case 2:
                    outInfo();
                    break;
                case 3:
                    find();
                    break;
                case 4:
                    sor();
                    break;
                case 5:
                    t = false;
                    break;
            }


        }
    }
}
