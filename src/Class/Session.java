package Class;

import java.io.Serializable;
import java.util.ArrayList;

public class Session implements Serializable {

    private String name;
    private double cgpa;
    private double creditCompleted;
    private CGPA cgpaClass;

    public Session() {
    }

    public Session(String name, CGPA cgpa) {
        this.cgpaClass = cgpa;
        this.name = name;
        this.cgpa = cgpaClass.getCalculatedCGPA();
        this.creditCompleted = cgpaClass.getTotalCredit();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCreditCompleted() {
        return creditCompleted;
    }

    public void setCreditCompleted(double creditCompleted) {
        this.creditCompleted = creditCompleted;
    }

    public CGPA getCgpaClass() {
        return cgpaClass;
    }

    public void setCgpaClass(CGPA cgpaClass) {
        this.cgpaClass = cgpaClass;
    }
}
