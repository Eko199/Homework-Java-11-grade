package RealHomework.Tema18;

public class PersonTest {
    public static void main(String[] args) {
        Person preson = new Person("Viktor", "Bulgaria", "08888888", "asdf@gmail.com");
        Student student = new Student("Alex", "England",
                "88888888", "asdf2@gmail.com", "fresh-man");
        Employee employee = new Employee("Pesho", "Macedonia",
                "999999", "asdf3@gmail.com", "Office420", 969.42);
        Faculty faculty = new Faculty("Gosho", "Byzantium", "-1111111",
                "asdf4@gmail.com", "Constantinople", 9999999.99, 8, "emperor");
        Staff staff = new Staff("Misho", "USA",
                "0000000", "asdf5@gmail.com", "Office420", 969.42, "lord");

        System.out.println(preson.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
