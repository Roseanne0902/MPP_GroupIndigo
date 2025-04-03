package lab3.problem1.src;


public class PersonWithJob {

    private Person person;

    private double salary;
    PersonWithJob(String n, double s) {
        this.person = new Person(n);
        this.salary = s;
    }
    public double getSalary() {
        return salary;
    }

    public String getName(){
        return person.getName();
    }
    public Person getPerson(){
        return person;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PersonWithJob{" +
                "person=" + person +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object aPersonWithJob) {
        if(aPersonWithJob == null) return false;
        if(!(aPersonWithJob instanceof PersonWithJob)) return false;
        PersonWithJob p = (PersonWithJob)aPersonWithJob;
        boolean isEqual = this.getName().equals(p.getName()) &&
                this.getSalary()==p.getSalary();
        return isEqual;
    }

}
