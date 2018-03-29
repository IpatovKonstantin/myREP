public class Employee {
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
        return LastName + " " + FirstName + " " + salary + " " + runk;
    }


}
