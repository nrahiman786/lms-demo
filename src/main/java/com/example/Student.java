import java.util.ArrayList;

public class Student {
    private String name;
    private String studentId;
    private String email;
    private ArrayList<Course> enrolledCourses;

    public Student(String name, String studentId, String email) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }
}
