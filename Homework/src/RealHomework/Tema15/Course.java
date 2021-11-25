package RealHomework.Tema15;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        boolean foundStudent = false;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                foundStudent = true;
            }
            if (foundStudent) {
                if (i == numberOfStudents - 1) {
                    students[i] = null;
                    break;
                }
                students[i] = students[i+1];
            }
        }
        numberOfStudents--;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
