package Class;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.*;

public class CGPA implements Serializable {

    private double currentCGPA;
    private double currentCredit;
    private double calculatedCGPA;
    private double totalCredit;
    private ArrayList<Course> courseList;
    DecimalFormat twoPoint = new DecimalFormat("#.##");


    public CGPA() {
        courseList = new ArrayList<Course>();
    }

    public CGPA(double currentCGPA, double currentCredit) {
        this.currentCGPA = currentCGPA;
        this.currentCredit = currentCredit;
        courseList = new ArrayList<Course>();
    }

    public double getCurrentCGPA() {
        return currentCGPA;
    }

    public void setCurrentCGPA(double currentCGPA) {
        this.currentCGPA = currentCGPA;
    }

    public double getCurrentCredit() {
        return currentCredit;
    }

    public void setCurrentCredit(double currentCredit) {
        this.currentCredit = currentCredit;
    }

    public double getCalculatedCGPA() {

        double totalGP = 0.0;
//        totalCredit = getTotalCredit();

        for (Course course : courseList) {
            totalGP += course.getCredit()*course.getGrade();
        }

        totalGP += currentCGPA*currentCredit;

        this.calculatedCGPA = totalGP/getTotalCredit();

        return Double.parseDouble(twoPoint.format(calculatedCGPA));
    }

    public double getTermCGPA() {

        double totalGP = 0.0;
        double termCGPA;


        for (Course course : courseList) {
            totalGP += course.getCredit()*course.getGrade();
        }

        //totalGP += currentCGPA*currentCredit;

        termCGPA = totalGP/getTermCredit();

        return Double.parseDouble(twoPoint.format(termCGPA));
    }

//    public void setCalculatedCGPA(double calculatedCGPA) {
//        this.calculatedCGPA = calculatedCGPA;
//    }

    public double getTotalCredit() {

        this.totalCredit = currentCredit;

        for (Course course : courseList) {
            totalCredit += course.getCredit();
        }

        return totalCredit;
    }

    public double getTermCredit() {

        double termCredit = 0.0;

        for (Course course : courseList) {
            termCredit += course.getCredit();
        }

        return termCredit;
    }

//    public void setTotalCredit(double totalCredit) {
//        this.totalCredit = totalCredit;
//    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {

        int count = 0;
        for (Course course1 : courseList) {
            if (course.getName().equals(course1.getName()))
                break;

            count++;
        }

        courseList.remove(count);
    }

    public void removeCourse2(int index) {
        courseList.remove(index);
    }

    @Override
    public String toString() {

        StringBuilder msg = new StringBuilder("     Course name          Credit          Grade Point           Letter Grade      " +
                "\n----------------------------------------------------------------------------------------------");

        for (Course course : courseList) {
            msg.append(course.toString());
        }

        msg.append("\n\n Term CGPA : " + getTermCGPA() + "        Credit : " + getTermCredit());

        return msg.toString();
    }
}
