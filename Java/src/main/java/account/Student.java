package account;

public class Student {

    private AccountData accountData;
    private double gpa;

    public Student(String name, int studentID, double gpa) {
        this.accountData = new AccountData(name, studentID);
        this.gpa = gpa;
    }

    public void updateGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getGPA() {
        return this.gpa;
    }

}
