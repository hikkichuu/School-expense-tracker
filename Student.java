package school.management.system;

public class Student {

    //its private because you want to protect someone from accessing the id outside student class
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        //this id from our student class = id from the parameters in parentheses
        feesPaid = 0;
        feesTotal= 3000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    //we do not alter students name and id so we dont use setStudent setId

    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public void setGrade(int grade){
        this.grade = grade;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getFeesPaid(){
        return feesPaid;
    }
    public int getFeesTotal(){
        return feesTotal;
    }
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }
}



