package exercises.school;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    int yearsTeaching;

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String aLastName) {
        lastName = aLastName;
    }

    public String getSubject() {
        return subject;
    }

    protected void setSubject(String aSubject) {
        subject = aSubject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    protected void setYearsTeaching(int aYearsTeaching) {
        yearsTeaching = aYearsTeaching;
    }

}
