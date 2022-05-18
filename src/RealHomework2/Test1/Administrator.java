package RealHomework2.Test1;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends SchoolMember implements Cloneable {
    private double salary;
    private int tasks = 0;
    private ArrayList<String> tasksList = new ArrayList<>();

    public Administrator() {
    }

    public Administrator(String name, String email, double salary) {
        super(name, email);
        this.salary = salary;
    }

    public Administrator(String name, String email, double salary, String[] tasksArr) {
        super(name, email);
        this.salary = salary;
        this.tasksList.addAll(List.of(tasksArr));
        this.tasks = tasksList.size();
    }

    @Override
    double getScore() {
        return tasks * salary;
    }

    @Override
    public String toString() {
        return "Administrator " + getName() + '\n' +
                "email: " + getEmail() +
                ", salary: " + salary +
                ", tasks: " + tasks +
                ", tasksList: " + tasksList +
                '\n';
    }

    @Override
    public Administrator clone() {
        try {
            Administrator clone = (Administrator) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.tasksList = (ArrayList<String>) tasksList.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
