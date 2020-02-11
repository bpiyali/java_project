package lambdas.pluralsight.chapter1;

public class Employee {
    double salary;
    String project;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", project='" + project + '\'' +
                '}';
    }
}
