public class Employee extends Object implements Comparable {
    private String LastName;
    private String FirstName;
    private Runk runk;
    private int salary;

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public Runk getRunk() {
        return runk;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String LastName, String FirstName, int salary, Runk runk){
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.runk = runk;
        this.salary = salary;
    }

    public String toString(){
        return LastName + " " + FirstName + " " + salary + " " + this.runk.getName();
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee second = (Employee) o;
            if (this.LastName.compareTo(second.getLastName())==0){
                return this.salary-second.getSalary();
            }
            else {
                return this.LastName.compareTo(second.getLastName());
            }
        }
        return 1;
    }
}