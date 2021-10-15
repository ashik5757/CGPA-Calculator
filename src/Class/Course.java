package Class;

public class Course {

    private String name;
    private double credit;
    private double grade;
    private String letterGrade;

    public Course() {
    }

    public Course(String name, double credit, String letterGrade) {
        this.name = name;
        this.credit = credit;
        this.letterGrade = letterGrade;
        setGrade(letterGrade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(String letterGrade) {

        switch (letterGrade) {
            case "A+", "A" -> this.grade = 4.0;
            case "A-" -> this.grade = 3.7;
            case "B+" -> this.grade = 3.3;
            case "B"  -> this.grade = 3.0;
            case "B-" -> this.grade = 2.7;
            case "C+" -> this.grade = 2.3;
            case "C"  -> this.grade = 2.0;
            case "C-" -> this.grade = 1.7;
            case "D+" -> this.grade = 1.3;
            case "D"  -> this.grade = 1.0;
            case "F"  -> this.grade = 0.0;
        }

    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }


    public String toString() {

        return  "\n         " + name +
                "                   " + credit +
                "                   " + grade +
                "                                  " + letterGrade +
                "\n----------------------------------------------------------------------------------------------"

                ;

    }



}
