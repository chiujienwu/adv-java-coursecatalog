package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course{

    String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, int credits, String prerequisites) {
        super(courseName, courseNumber, credits);
        this.setPrerequisites(prerequisites);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return "IntroJavaCourse" + super.toString() + ", " +
                "prerequisites='" + prerequisites + '\'' +
                '}';
    }
}
