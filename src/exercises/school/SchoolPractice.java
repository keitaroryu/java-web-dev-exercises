package exercises.school;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student brian = new Student();
        brian.setName("Brian Nguyen");
        brian.setStudentId(1);
        brian.setNumberOfCredits(1);
        brian.setGpa(4.0);

        System.out.println("Name: "+brian.getName());
        System.out.println("Student Id: "+brian.getStudentId());
        System.out.println("Number of Credits: "+brian.getNumberOfCredits());
        System.out.println("GPA: "+brian.getGpa());

        Course calculus = new Course();
        ArrayList<Student> studentRoster = new ArrayList<>();
        studentRoster.add(brian);

        calculus.setCourseName("Calculus");
        calculus.setCourseId("MATH-110");
        calculus.setRoster(studentRoster);

        System.out.println("Course Name: "+calculus.getCourseName());
        System.out.println("Course Id: "+calculus.getCourseId());
        System.out.println("Roster: ");
        for (Student i: calculus.getRoster()) {
            System.out.println("\t" + i.getName());
        }

        Teacher davidson = new Teacher();
        davidson.setFirstName("Davidson");
        davidson.setLastName("Harper");
        davidson.setSubject("Math");
        davidson.setYearsTeaching(10);

        System.out.println("Teacher First Name: "+davidson.getFirstName());
        System.out.println("Teacher Last Name: "+davidson.getLastName());
        System.out.println("Teacher's Subject: "+davidson.getSubject());
        System.out.println("Teacher's Years Teaching: "+davidson.getYearsTeaching());

    }
}
