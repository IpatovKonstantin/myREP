import java.util.ArrayList;
import java.util.List;

public class Office {

    private ArrayList<Employee> list = new ArrayList<>();

    public void sort() {
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    Employee buf = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, buf);
                }
            }
        }

    }

    public List<Employee> find(Runk runk) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee : list) {
            if (runk == employee.getRunk()) {
                result.add(employee);
            }
        }
        return result;
    }

    public void showEmployeeList() {

        for (Employee element : this.list) {
            System.out.println(element.toString());
        }
    }

    public void add(Employee employee) {
        list.add(employee);
    }
}
