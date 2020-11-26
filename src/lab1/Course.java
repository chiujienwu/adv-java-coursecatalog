package lab1;

import javax.swing.*;

public abstract class Course {

    private String courseName;
    private String courseNumber;
    private double credits;

    public Course(String courseName, String courseNumber, double credits) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }

    public final String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    @Override
    public String toString() {
        return  "{courseName='" + courseName + '\'' +
                ", courseNumber='" + courseNumber + '\'' +
                ", credits=" + credits;
    }
}
