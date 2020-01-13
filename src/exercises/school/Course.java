package exercises.school;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private String courseId;
    private ArrayList<Student> roster = new ArrayList<>();

    public String getCourseName() {
        return courseName;
    }

    protected void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public String getCourseId() {
        return courseId;
    }

    protected void setCourseId(String aCourseId) {
        courseId = aCourseId;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    protected void setRoster(ArrayList<Student> aRoster) {
        roster = aRoster;
    }

}
