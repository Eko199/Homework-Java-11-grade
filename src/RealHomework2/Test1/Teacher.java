package RealHomework2.Test1;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends SchoolMember implements Cloneable {
    private int monthsInternship;
    private int subjects = 0;
    private ArrayList<String> subjectsList = new ArrayList<>();

    public Teacher() {
    }

    public Teacher(String name, String email, int monthsInternship) {
        super(name, email);
        this.monthsInternship = monthsInternship;
    }

    public Teacher(String name, String email, int monthsInternship, String[] subjectsArr) {
        super(name, email);
        this.monthsInternship = monthsInternship;
        this.subjectsList.addAll(List.of(subjectsArr));
        this.subjects = subjectsList.size();
    }

    @Override
    double getScore() {
        return monthsInternship * subjects;
    }

    @Override
    public String toString() {
        return "Teacher " + getName() + "\n" +
                "email: " + getEmail() +
                ", monthsInternship: " + monthsInternship +
                ", subjects: " + subjects +
                ", subjectsList=" + subjectsList +
                '\n';
    }

    @Override
    public Teacher clone() {
        try {
            Teacher clone = (Teacher) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.subjectsList = (ArrayList) subjectsList.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
