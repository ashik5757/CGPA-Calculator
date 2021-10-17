package Class;

import java.text.DecimalFormat;
import java.util.*;

public class CGPA {

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

}
