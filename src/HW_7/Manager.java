package HW_7;

public class Manager extends BaseEmployee{

    private int workerCount;

    public Manager(String name, int age, char gender, int daySalary, int workers) {
        super(name, age, gender, daySalary);
        this.workerCount = workers;
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

    public int getSalary(int days){
        int salary = getDaySalary() * days;
        return (int)(salary + salary * (getWorkerCount()) / 100.0);
    }
}
