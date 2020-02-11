package lambdas.pluralsight.chapter1;

import java.util.function.Function;

public class MainComparator {

    public static void main(String[] args) {
        Comparator<Person> compAge = (p1, p2) -> p1.getAge() - p2.getAge();
        Comparator<Person> compFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> compLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());

        Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, String> f2 = p -> p.getFirstName();
        Function<Person, String> f3 = p -> p.getLastName();

        //Comparator<Person> personAge = Comparator.comparing(f1);
        //Comparator<Person> personAge = Comparator.comparing(p -> p.getAge());
        Comparator<Person> personAge = Comparator.comparing(Person::getAge);

        Comparator<Person> personFirstname = Comparator.comparing(Person::getFirstName);

        Comparator<Employee> compEmp = Comparator.comparing(Employee::getSalary);

        Comparator<Person> cmp = Comparator.comparing(Person::getLastName)
                                            .thenComparing(Person::getFirstName)
                                            .thenComparing(Person::getAge);

    }
}
