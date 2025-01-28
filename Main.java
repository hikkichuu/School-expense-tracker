package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher Malu = new Teacher(1, "Malu", 1200);
        Teacher Eduardo = new Teacher(2,"Dudu",1400);
        Teacher Natasha = new Teacher(3,"Nat", 5000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Malu);
        teacherList.add(Eduardo);
        teacherList.add(Natasha);

        Student Pandora = new Student(1, "Pandora", 10);
        Student Ariel = new Student(2, "Ariel", 8);
        Student Diva = new Student(3,"Diva", 10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Pandora);
        studentList.add(Ariel);
        studentList.add(Diva);

        School sea = new School(teacherList,studentList);


        Pandora.payFees(7000);
        Diva.payFees(10000);
        System.out.println("Sea has earned $" + sea.getTotalMoneyEarned());
        Malu.receiveSalary(Malu.getSalary());
        System.out.println("Sea will pay " + Malu.getName() + " and now has $" + sea.getTotalMoneyEarned());



    }

}