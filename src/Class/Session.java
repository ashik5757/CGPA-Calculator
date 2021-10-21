package Class;

public class Session {

    private String name;
    private double cgpa;
    private double creditCompleted;

    public Session() {
    }

    public Session(String name, double cgpa, double creditCompleted) {
        this.name = name;
        this.cgpa = cgpa;
        this.creditCompleted = creditCompleted;
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


}
