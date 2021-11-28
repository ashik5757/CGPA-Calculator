package Class;

import java.io.Serializable;
import java.util.ArrayList;

public class Profile implements Serializable {

    private String name;
    private String university;
    private String firstSemester;
    private String session;
    private int year;
    private double cgpa;
    private double creditCompleted;
    private ArrayList<Session> sessionList;

    public Profile() {
        this.sessionList = new ArrayList<Session>();
    }

    public Profile(String name, String university, String session, int year) {
        this.name = name;
        this.university = university;
        this.session = session;
        this.year = year;
        this.firstSemester = this.session +"-"+ this.year;
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

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
