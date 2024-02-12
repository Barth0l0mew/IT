package OOP.Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Students {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "Ivanov",1));
        students.add(new Student("Ivan","Alekseev",1));
        students.add(new Student("Jon","Doe",1));
        students.add(new Student("Jane","Smith",1));
        for (Student student:students)
            System.out.println(student.toString());
        System.out.println("-----------");
        Collections.sort(students);
        for (Student student:students)
            System.out.println(student.toString());
        Comparator<Student> compName = Comparator.comparing(obj->obj.getName());
        Comparator<Student> compGrade = Comparator.comparing(student -> student.getGrade());
        Comparator<Student> compNameSurname  = Comparator.comparing((Student s)->s.getName()).thenComparing(s->s.getSurname());
        Collections.sort(students,compName);
        System.out.println("---------------------");
        for (Student student:students)
            System.out.println(student.toString());
        Collections.sort(students,compGrade);
        System.out.println("---------------------");
        for (Student student:students)
            System.out.println(student.toString());
        Collections.sort(students,new CompSurname());
        System.out.println("---------------------");
        for (Student student:students)
            System.out.println(student.toString());
        Collections.sort(students,compNameSurname);
        System.out.println("---------------------");
        for (Student student:students)
            System.out.println(student.toString());
    }
}
class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private int grade;

    public Student(String name, String surname, int grade) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("CompareTO");
        return this.surname.compareTo(o.surname);
    }
}
class CompSurname implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}