package school.management.system;
//this class is reabonsible for keeping track of teacher nsame, id and salary
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private static int salaryEarned;


    //constructor and (parameters)
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    //getter. the get method will return the values

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    //setter. the id and name is already set do wont need a setter
    //but the salary can change so we set it

    public void setSalary(int salary){
        this.salary= salary;
    }

    //add to salary and removes from total money earned by the school
    public static void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

}
