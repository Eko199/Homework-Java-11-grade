package RealHomework.Tema8;

public class StudentScholarship {
    public static boolean isStudentGoodEnough(Student student) {
        if (student.getAverageGrade() > 5.84) {
            student.setBalance(student.getBalance() + 100);
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Student misho = new Student("Misho", 5.50);
        Student viktor = new Student("Viktor", 6.00);
        System.out.println(isStudentGoodEnough(misho));
        System.out.println(isStudentGoodEnough(viktor));
        System.out.println(misho.getBalance());
        System.out.println(viktor.getBalance());
    }
}
