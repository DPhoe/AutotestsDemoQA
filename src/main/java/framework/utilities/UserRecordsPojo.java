package framework.utilities;

import java.util.ArrayList;

public class UserRecordsPojo {

    private String firstName;
    private String lastName;
    private String email;
    private String age;
    private String salary;
    private String department;
    private ArrayList records;

    public UserRecordsPojo(String firstName, String lastName, String email, String age, String salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public UserRecordsPojo() {
    }

    public String getFirstName() {
        return firstName;
    }

    public ArrayList getRecords() {
        return records;
    }

    public void setRecords(ArrayList records) {
        this.records = records;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

