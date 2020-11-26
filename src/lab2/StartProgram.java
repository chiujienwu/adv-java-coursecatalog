package lab2;

import java.util.ArrayList;
import java.util.List;

public class StartProgram {
    public static void main(String[] args) {
        List<CourseInterface> courses = new ArrayList<>();
        courses.add(new IntroJavaCourse("Beginning Java", "CS101", 4, "CS100"));
        courses.add(new AdvancedJavaCourse("Intermediate Java", "CS200", 4, "CS101"));
        courses.add(new IntroToProgrammingCourse("Beginning Programming", "CS100", 3));

        for (CourseInterface c : courses
        ) {
            System.out.println(c);
        }
    }
}
