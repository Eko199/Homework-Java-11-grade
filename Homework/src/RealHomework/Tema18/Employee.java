package RealHomework.Tema18;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date DATE_HIRED = new Date();

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
    }

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.DATE_HIRED = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return DATE_HIRED;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", office=" + office +
                ", salary=" + salary +
                ", DATE_HIRED=" + DATE_HIRED.toString();
    }
}
