package RealHomework2.Test1;

import java.util.ArrayList;
import java.util.Collection;

public abstract class SchoolMember implements Comparable<SchoolMember> {
    private String name;
    private String email;

    protected SchoolMember() {}

    protected SchoolMember(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    abstract double getScore();

    @Override
    public int compareTo(SchoolMember o) {
        return Double.compare(this.getScore(), o.getScore());
    }

    public static <T extends SchoolMember> double sumScore(Collection<T> list) {
        double result = 0;
        for (T element : list) {
            result += element.getScore();
        }
        return result;
    }
}
