package lab10.problem5;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {
    class Employee {
        private String name;
        public Employee(String name) { this.name = name; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    class EmployeeNameComparator {
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    }

    class Apple {
        private double weight;
        public Apple(double weight) { this.weight = weight; }
        public double getWeight() { return weight; }
    }

    // A. (Employee e) -> e.getName()
    Function<Employee, String> getName1 = (Employee e) -> e.getName();
    Function<Employee, String> getName2 = Employee::getName;

    // B. (Employee e, String s) -> e.setName(s)
    BiConsumer<Employee, String> setName1 = (e, s) -> e.setName(s);
    BiConsumer<Employee, String> setName2 = Employee::setName;

    // C. (String s1, String s2) -> s1.compareTo(s2)
    BiFunction<String, String, Integer> compareTo1 = (s1, s2) -> s1.compareTo(s2);
    BiFunction<String, String, Integer> compareTo2 = String::compareTo;

    // D. (Integer x, Integer y) -> Math.pow(x, y)
    BiFunction<Integer, Integer, Double> pow1 = (x, y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> pow2 = (x, y) -> Math.pow(x, y.doubleValue());
    BiFunction<Double, Double, Double> powCorrect = Math::pow;

    // E. (Apple a) -> a.getWeight()
    Function<Apple, Double> getWeight1 = (Apple a) -> a.getWeight();
    Function<Apple, Double> getWeight2 = Apple::getWeight;

    // F. (String x) -> Integer.parseInt(x)
    Function<String, Integer> parseInt1 = (x) -> Integer.parseInt(x);
    Function<String, Integer> parseInt2 = Integer::parseInt;

    // G. (Employee e1, Employee e2) -> comp.compare(e1, e2)
    EmployeeNameComparator comp = new EmployeeNameComparator();
    BiFunction<Employee, Employee, Integer> compareEmp1 = (e1, e2) -> comp.compare(e1, e2);
    BiFunction<Employee, Employee, Integer> compareEmp2 = comp::compare;

    // Evaluator method to test all
    public void evaluator() {
        Employee e1 = new Employee("Alice");
        Employee e2 = new Employee("Bob");
        Apple a = new Apple(1.5);

        System.out.println("A. getName: " + getName2.apply(e1));
        setName2.accept(e1, "Charlie");
        System.out.println("B. setName: " + getName2.apply(e1));
        System.out.println("C. compareTo: " + compareTo2.apply("apple", "banana"));
        System.out.println("D. Math.pow: " + powCorrect.apply(2.0, 3.0));
        System.out.println("E. getWeight: " + getWeight2.apply(a));
        System.out.println("F. parseInt: " + parseInt2.apply("42"));
        System.out.println("G. compare Employees: " + compareEmp2.apply(e1, e2));
    }

    public static void main(String[] args) {
        Examples ex = new Examples();
        ex.evaluator();
    }
}