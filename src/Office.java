import java.util.ArrayList;
import java.util.List;

public class Office {

    private ArrayList<Employee> list = new ArrayList<>();

    public boolean isEmployeanoffice(Employee employee){
        return list.contains(employee);
    }

    public List<Employee> sort(){
        List<Employee> intList = new ArrayList<>();

        for (Employee employee: this.list){
            for (int i = 0; i<list.size()-1;i++) {
                Employee min = list.get(i);
                for (int j = i+1; j < list.size(); j++) {
                    if (list.get(i).getLastName().compareTo(list.get(j).getLastName()) > 0) {
                        min = list.get(j);
                    }
                }
                intList.add(min);
            }
        }
        return intList;

    }

    public List<Employee> find(Runk runk){
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee: list){
            if (runk == employee.getRunk()){
                result.add(employee);
            }
        }
        return result;
    }

    public void showEmployeeList(){

        for (Employee element: this.list){
            System.out.print(element.getLastName()+" ");
            System.out.print(element.getFirstName()+" ");
            System.out.print(element.getSalary()+" ");
            System.out.println(element.getRunk());
        }
    }

    public void add(Employee employee){
        list.add(employee);
    }

    public ArrayList<Employee> getList() {
        return list;
    }
}
