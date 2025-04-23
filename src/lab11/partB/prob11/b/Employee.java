package lab11.partB.prob11.b;

public class Employee {
    String firstName, lastName;

    int salary;

    public Employee(String f, String l, int s) {
        this.firstName = f;
        this.lastName = l;
        this.salary = s;
    }

    @Override
    public String toString() {
        return "<" + "first name: " +
                firstName +
                " last name: " +
                lastName +
                " salary: " +
                salary + ">";

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

