package exercises.school;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student brian = new Student("Brian Nguyen", 1, 1, 4.0);
        Student angela = new Student("Angela", 2, 92, 4.0);

        Teacher davidson = new Teacher("Davidson", "Harper", "Math", 10);

        ArrayList<Student> studentRoster = new ArrayList<>();
        studentRoster.add(brian);
        studentRoster.add(angela);

        Course calculus = new Course("Calculus", davidson, studentRoster);

        System.out.println(brian.toString());
        brian.addGrade(4, 3.0);
        System.out.println(brian.toString());
        brian.addGrade(3, 3.5);
        System.out.println(brian.toString() + " " + brian.getGradeLevel());
        brian.addGrade(4, 3.0);
        brian.addGrade(4, 3.0);
        brian.addGrade(4, 3.0);
        brian.addGrade(4, 3.0);
        brian.addGrade(4, 3.0);
        System.out.println(brian.toString() + " " + brian.getGradeLevel());
        brian.addGrade(4, 3.0);
        System.out.println(brian.toString() + " " + brian.getGradeLevel());

        System.out.println("\n" + calculus.toString());

//        System.out.println("Name: "+brian.getName());
//        System.out.println("Student Id: "+brian.getStudentId());
//        System.out.println("Number of Credits: "+brian.getNumberOfCredits());
//        System.out.println("GPA: "+brian.getGpa());

//        System.out.println("\nCourse Topic: "+calculus.getTopic());
//        System.out.println("Instructor: "+calculus.getInstructor());
//        System.out.println("Enrolled Students: ");
//        for (Student i: calculus.getEnrolledStudents()) {
//            System.out.println("\t" + i.getName());
//        }

        System.out.println("\nTeacher First Name: "+davidson.getFirstName());
        System.out.println("Teacher Last Name: "+davidson.getLastName());
        System.out.println("Teacher's Subject: "+davidson.getSubject());
        System.out.println("Teacher's Years Teaching: "+davidson.getYearsTeaching());

    }
}
