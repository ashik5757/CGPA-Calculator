package Class;

import java.io.Serializable;
import java.util.ArrayList;

public class Profile implements Serializable {

    private String name;
    private String university;
    private String firstSemester;
    private double cgpa;
    private double creditCompleted;
    private ArrayList<Session> sessionList;

    public Profile() {
        //this.sessionList = new ArrayList<Session>();
    }

    public Profile(String name, String university, String firstSemester) {
        this.name = name;
        this.university = university;
        this.firstSemester = firstSemester;
        this.cgpa = 0;
        this.creditCompleted = 0;
        this.sessionList = new ArrayList<Session>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFirstSemester() {
        return firstSemester;
    }

    public void setFirstSemester(String firstSemester) {
        this.firstSemester = firstSemester;
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

    public ArrayList<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(ArrayList<Session> sessionList) {
        this.sessionList = sessionList;
    }

    public void addSession(Session session) {
        sessionList.add(session);
    }

    public void removeSession(int index) {
        sessionList.remove(index);
    }


}
