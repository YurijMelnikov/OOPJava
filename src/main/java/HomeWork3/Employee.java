package HomeWork3;

import java.util.Comparator;

class Employee implements Comparable<Employee> {
    private String fullName;
    private Integer age;
    private Integer salary;
    private String department;

    Employee(String fullName, Integer age, Integer salary, String department) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(this.fullName)
                .append("\t\t")
                .append(this.age.toString())
                .append("\t")
                .append(this.salary.toString())
                .append("\t")
                .append(this.department);

        return string.toString();
    }

    @Override
    public int compareTo(Employee employee) {
        return this.fullName.compareTo(employee.fullName);
    }
}


