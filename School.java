package school.management.system;
import java.util.List;
//schools have multiple teachers
public class School {
    /**
     * cant do private Teacher teacher1, teacher2, teacher3;
     * you have to create an array of teachers/students when you know how many:
     * private Teacher[] teacher = new Teacher[25];
     * but how do you account for a changing number of teachers?
     * not arrays. but ArrayList
     */
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    //a new school object is created
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    //@return the list of teachers in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }
    /**
     * adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);

    }
    public List<Student> getStudents(){
        return students;
    }
    //verify this later
    public void addStudent(Student student){
        students.add(student);
    }
    public static int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }
    public static void updateTotalMoneyEarned(int MoneyEarned){
        totalMoneyEarned += MoneyEarned;
    }
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }
    //the money spent by the school is the teachers salary
    public static void updateTotalMoneySpent(int moneySpent){
        // totalMoneyEarned = totalMoneyEarned - moneySpent; is the same as -= bellow
        totalMoneyEarned -= moneySpent;
    }
}
