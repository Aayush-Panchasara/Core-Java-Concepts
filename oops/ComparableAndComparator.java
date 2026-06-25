package oops;
/*Write a program to demonstrate comparable and comparator interface. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student obj) {
        return this.id - obj.id;
    }
}

class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee empOne, Employee empTwo) {
        return empOne.name.compareTo(empTwo.name);
    }
}

public class ComparableAndComparator {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Aayush"));
        students.add(new Student(103, "Vandan"));
        students.add(new Student(102, "Dinesh"));
        // Internally use the compareTo method for comparizon.
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.id + " " + student.name);
        }

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Yash", 45000));
        employees.add(new Employee(2, "Parth", 40000));
        employees.add(new Employee(3, "Ayush", 42000));
        // Here It use the compare method that is written in class called NameComparator, and sort based on Employee's name
        Collections.sort(employees, new NameComparator());
        System.out.println("Sorting based on Employee's name\n");
        for (Employee employee : employees) {
            System.out.println(employee.id + " " + employee.name);
        }
        // Here the sorting is based on Employee's salary
        Collections.sort(employees, (emp1, emp2) -> Double.compare(emp1.salary, emp2.salary));
        System.out.println("Shorting based on Employee's salary\n");
        for (Employee employee : employees) {
            System.out.println(employee.id + " " + employee.name);
        }
    }

}
